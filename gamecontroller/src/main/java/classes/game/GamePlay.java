package classes.game;

import classes.player.components.Panzer;
import classes.player.components.Radar;
import interfaces.game.IGamePlay;
import game.api.IGameState;
import game.api.component.IHealth;
import game.api.component.IPetrol;
import game.api.component.IRemoteControl;
import game.api.component.ITarget;
import game.api.player.IPanzer;
import interfaces.game.ICommandSource;
import interfaces.game.IGameField;
import interfaces.game.IGameObject;
import interfaces.player.IOwnership;
import interfaces.player.IPlayer;

import java.util.Iterator;

public class GamePlay implements IGamePlay {

    private Iterable<IPlayer> players;
    private Iterable<IGameObject> objects;
    private IGameField gameField;

    public GamePlay(final Iterable<IPlayer> players, final Iterable<IGameObject> objects, final IGameField gameField) {
        this.gameField = gameField;
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
                            IHealth health = (IHealth) obj.getKey("health");
                            IPetrol petrol = (IPetrol) obj.getKey("petrol");
                            IPanzer panzer = new Panzer(remoteControl, target, health, petrol);
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
