package classes.game;

import classes.player.control.RemoteControl;
import interfaces.game.IGameField;
import interfaces.game.IGameObject;
import interfaces.player.IPlayer;
import interfaces.player.control.IRemoteControl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Manages initialization of game objects
 */
public class GameManager {

    //TODO: make insertion of init properties

    public IGameField init() {

        Iterable<IPlayer> players = initPlayers();
        Iterator<IGameObject> objects = initGameObject();

        return new GameField(players, objects);
    }

    private Iterable<IPlayer> initPlayers() {

        return Collections.EMPTY_LIST;
    }

    private Iterator<IGameObject> initGameObject() {

        List<IGameObject> objects = new LinkedList<>();
        IGameObject panzer = new GameObject(new HashMap<>());
        IRemoteControl remoteControl = new RemoteControl(
                panzer,
                () -> {
                    IGameObject bullet = new GameObject(new HashMap<>());
                    objects.add(bullet);
                    return bullet;
                }
        );
        return objects.iterator();
    }
}
