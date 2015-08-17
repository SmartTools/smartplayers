package classes.game;

import interfaces.game.IGameField;
import interfaces.game.IGameObject;
import interfaces.player.IPlayer;

import java.util.Collections;
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
        
        return objects.iterator();
    }
}
