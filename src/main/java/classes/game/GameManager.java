package classes.game;

import classes.player.control.RemoteControl;
import interfaces.IPropertySource;
import interfaces.game.IGameField;
import interfaces.game.IGameObject;
import interfaces.player.IPlayer;
import interfaces.player.control.IRemoteControl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Manages initialization of game objects
 */
public class GameManager {

    IPropertySource propertySource;

    public IGameField init() {

        Iterable<IPlayer> players = initPlayers();
        Iterator<IGameObject> objects = initGameObject(players);

        return new GameField(players, objects);
    }

    private Iterable<IPlayer> initPlayers() {

        Integer playersNum = Integer.parseInt(this.propertySource.getProperty("players.number"));
        List<IPlayer> players = new LinkedList<>();
        for (int i = 0; i < playersNum; i++) {
            //players.add()
        }
        return players;
    }

    private Iterator<IGameObject> initGameObject(final Iterable<IPlayer> players) {

        List<IGameObject> objects = new LinkedList<>();
        for (IPlayer player : players) {
            Integer panzersNumber = Integer.parseInt(this.propertySource.getProperty("panzers.number"));
            for (int i = 0; i < panzersNumber; i++) {
                Map<String, Object> panzerComponents = new HashMap<>();
                IGameObject panzer = new GameObject(panzerComponents);
                IRemoteControl remoteControl = new RemoteControl(
                    panzer,
                    () -> {
                        IGameObject bullet = new GameObject(new HashMap<>());
                        objects.add(bullet);
                        return bullet;
                    }
                );
            }
        }
        return objects.iterator();
    }
}
