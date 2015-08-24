package classes.draw;

import interfaces.draw.IGameStep;
import interfaces.game.IGameObject;

import java.util.Iterator;

/**
 * Created by kkp on 20.08.15.
 */
public class GameStep implements IGameStep {
    Iterator<IGameObject> objs;

    @Override
    public void setGameObjects(Iterator<IGameObject> objs) {
        this.objs = objs;
    }

    @Override
    public Iterator<IGameObject> getGameObjects() {
        return objs;
    }
}
