package classes.game;

import game.api.IGameState;
import interfaces.game.*;
import interfaces.player.IOwnership;
import interfaces.player.IPlayer;
import game.api.component.IHealth;
import game.api.player.IPanzer;
import game.api.component.ITarget;
import game.api.component.IRemoteControl;
import classes.player.components.Panzer;
import classes.player.components.Radar;

import java.util.Iterator;

/**
 * Game field. It realizes strategy.
 */
public class GameField implements IGameField {

    private Iterable<IPlayer> players;
    private Iterable<IGameObject> objects;

    public GameField(final Iterable<IPlayer> players, final Iterable<IGameObject> objects) {
        this.players = players;
        this.objects = objects;
    }

    @Override
    public void update() {

        while(!hasWinner()) {
            for (IPlayer player : players) {
                IGameState gameState = new GameState(
                    new Radar(new GameObjectIteratorDecorator<ITarget>(objects.iterator(), "target")),
                    new GameObjectIteratorDecorator<IPanzer>(
                        objects.iterator(),
                        "remoteControl",
                        (IGameObject obj) -> {
                            ITarget target = (ITarget) obj.getKey("target");
                            IRemoteControl remoteControl = (IRemoteControl) obj.getKey("remoteControl");
                            IOwnership ownership = (IOwnership) obj.getKey("ownership");
                            IHealth health = (IHealth) obj.getKey("health");
                            IPanzer panzer = new Panzer(remoteControl, target, ownership, health);
                            return panzer;
                        },
                        (IGameObject obj) -> {
                            IOwnership ownership = (IOwnership) obj.getKey("ownership");
                            return ownership.getOwner().equals(player.getName());
                        }
                    )
                );
                player.getStrategy().step(gameState);
            }
            GameObjectIteratorDecorator<ICommandSource> commands =
                new GameObjectIteratorDecorator<ICommandSource>(objects.iterator(), "command");

            while (commands.hasNext()) {
                commands.next().command().action();
            }
        }

    }

    private Boolean hasWinner() {
        Iterator<IOwnership> units = new GameObjectIteratorDecorator<>(
                objects.iterator(),
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
}
