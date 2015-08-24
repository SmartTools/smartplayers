package classes.draw;

import classes.game.GameObjectIteratorDecorator;
import interfaces.draw.*;
import interfaces.game.IGameObject;
import interfaces.player.components.ITarget;

import java.net.URL;
import java.util.Iterator;

/**
 * Created by kkp on 20.08.15.
 */
public class DrawField implements IDrawField {
    IHistory history;

    URL file;
    public DrawField(IHistory history) {
        this.history = history;
    }

    @Override
    public void setHistory(IHistory history) {
        this.history = history;
    }

    @Override
    public void setVisiableConfig(URL file) {
        this.file = file;
    }

    @Override
    
    public void drawStep(IGameStep step) {
        Iterator<IGameObject> objs = step.getGameObjects();
        ICanvasDrawer draw = new CanvasDrawer();
        GameObjectIteratorDecorator<IDrawable> targets =
                new GameObjectIteratorDecorator<IDrawable>(objs, "target");

        while (targets.hasNext()) {
            IDrawable target = targets.next();
            draw.draw(target);
        }



    }
}
