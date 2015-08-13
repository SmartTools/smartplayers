package classes.game;

import interfaces.game.*;
import interfaces.player.IOwnership;
import interfaces.player.IPlayer;
import interfaces.player.components.IPanzer;
import interfaces.player.components.ITarget;
import interfaces.player.control.IRemoteControl;
import classes.player.components.Panzer;
import classes.player.components.Radar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Game field. It realizes strategy.
 */
public class GameField implements IGameField {

    private Iterable<IPlayer> players;
    private Iterator<IGameObject> objects;

    @Override
    public void update() {

        while(!hasWinner()) {
            for (IPlayer player : players) {
                Iterator<IPanzer> panzers = new GameObjectIteratorDecorator<Panzer>(
                        objects,
                        "remoteControl",
                        (IGameObject obj) -> {
                            ITarget target = (ITarget) obj.getKey("target");
                            IRemoteControl remoteControl = (IRemoteControl) obj.getKey("remoteControl");
                            IOwnership ownership = (IOwnership) obj.getKey("ownership");
                            Panzer panzer = new Panzer(remoteControl, target, ownership);
                            return panzer;
                        }
                );
                List<IPanzer> playerPanzers = new LinkedList<>();
                while (panzers.hasNext()) {
                    IPanzer panzer = panzers.next();
                    if(panzer.getOwnership().getOwner().equals(player.getName())) {
                        playerPanzers.add(panzer);
                    }
                }
                IGameState gameState = new GameState(
                    new Radar(new GameObjectIteratorDecorator<ITarget>(objects, "target")),
                    playerPanzers.iterator()
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

    private boolean hasWinner() {
        return false;
    }

    public Iterable<IPlayer> getPlayers() {
        return players;
    }

    public Iterator<IGameObject> getObjects() {
        return objects;
    }
}
