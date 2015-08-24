package interfaces.draw;

import interfaces.game.IGameObject;

import java.util.Iterator;

/**
 * Created by kkp on 17.08.15.
 */
public interface IGameStep {
    void setGameObjects(final Iterator<IGameObject>  objs);
    Iterator<IGameObject>   getGameObjects();
}
