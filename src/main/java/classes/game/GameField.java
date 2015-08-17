package classes.game;

import interfaces.game.*;
import interfaces.player.IOwnership;
import interfaces.player.IPlayer;
import interfaces.player.components.IHealth;
import interfaces.player.components.IPanzer;
import interfaces.player.components.ITarget;
import interfaces.player.control.IRemoteControl;
import classes.player.components.Panzer;
import classes.player.components.Radar;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Game field. It realizes strategy.
 */
public class GameField implements IGameField {

    private Iterable<IPlayer> players;
    private Iterator<IGameObject> objects;

    public GameField(final Iterable<IPlayer> players, final Iterator<IGameObject> objects) {
        this.players = players;
        this.objects = objects;
    }

    @Override
    public void update() {

        while(!hasWinner()) {
            for (IPlayer player : players) {
                IGameState gameState = new GameState(
                    new Radar(new GameObjectIteratorDecorator<ITarget>(objects, "target")),
                    new GameObjectIteratorDecorator<Panzer>(
                        objects,
                        "remoteControl",
                        (IGameObject obj) -> {
                            ITarget target = (ITarget) obj.getKey("target");
                            IRemoteControl remoteControl = (IRemoteControl) obj.getKey("remoteControl");
                            IOwnership ownership = (IOwnership) obj.getKey("ownership");
                            IHealth health = (IHealth) obj.getKey("health");
                            Panzer panzer = new Panzer(remoteControl, target, ownership, health);
                            return panzer;
                        },
                        (IGameObject obj) -> {
                            IOwnership ownership = (IOwnership) obj.getKey("ownership");
                            return ownership.getOwner().equals(player.getName());
                        }
                    )
                );
                player.getStrategy().step(gameState);

                GameObjectIteratorDecorator<ICommandSource> commands =
                    new GameObjectIteratorDecorator<ICommandSource>(objects, "command");

                while (commands.hasNext()) {
                    commands.next().command().action();
                }
            }
        }

    }

    private Boolean hasWinner() {
        Iterator<IOwnership> units = new GameObjectIteratorDecorator<>(
                objects,
                "remoteControl",
                (IGameObject obj) -> (IOwnership) obj.getKey("ownership"),
                (IGameObject obj) -> {
                    IHealth health = (IHealth) obj.getKey("health");
                    return health.getValue() > 0;
                }
        );
        if (!units.hasNext()) {
            return Boolean.TRUE;
        }
        String player = units.next().getOwner();
        while (units.hasNext()) {
            IOwnership unit = units.next();
            if (!player.equals(unit.getOwner())) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public Iterable<IPlayer> getPlayers() {
        return players;
    }

    public Iterator<IGameObject> getObjects() {
        return objects;
    }
}
