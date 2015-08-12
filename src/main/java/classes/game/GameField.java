package classes.game;

import interfaces.game.*;
import interfaces.player.IPlayer;
import interfaces.player.components.ITarget;
import interfaces.player.control.IRemoteControl;
import classes.player.components.Panzer;
import classes.player.components.Radar;

import java.util.Iterator;

/**
 * Game field. It realizes strategy.
 */
public class GameField implements IGameField {

    Iterable<IPlayer> players;
    Iterator<IGameObject> objects;

    @Override
    public void update() {
        for (IPlayer player : players) {
            IGameState gameState = new GameState(
                new Radar(new GameObjectIteratorDecorator<ITarget>(objects, "target")),
                new GameObjectIteratorDecorator<Panzer>(
                    objects,
                    "remoteControl",
                    (IGameObject obj) -> {
                        ITarget target = (ITarget) obj.getKey("target");
                        IRemoteControl remoteControl = (IRemoteControl) obj.getKey("remoteControl");
                        Panzer panzer = new Panzer(remoteControl, target);
                        return panzer;
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

    public Iterable<IPlayer> getPlayers() {
        return players;
    }

    public Iterator<IGameObject> getObjects() {
        return objects;
    }
}
