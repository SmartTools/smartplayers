package classes.game;

import interfaces.game.IGameField;
import interfaces.game.IGameObject;
import interfaces.player.IPlayer;
import interfaces.player.components.ITarget;
import interfaces.game.IGameState;
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
        }

    }

    public Iterable<IPlayer> getPlayers() {
        return players;
    }

    public Iterator<IGameObject> getObjects() {
        return objects;
    }
}
