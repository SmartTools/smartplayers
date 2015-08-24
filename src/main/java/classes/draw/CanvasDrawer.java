package classes.draw;

import classes.player.components.geometry.Circle;
import classes.player.components.geometry.Rectangle;
import interfaces.draw.ICanvasDrawer;
import interfaces.draw.ICanvasSetter;
import interfaces.draw.IDrawable;
import interfaces.player.components.ITarget;

/**
 * Created by kkp on 20.08.15.
 */
public class CanvasDrawer implements ICanvasDrawer {
    @Override
    public void draw(IDrawable shape) {
        String name = shape.getTarget().getShape().getClass().getName();
        //name = "draw" + name;
        //CanvasDrawer.[name](target);
        if (name.equals(Circle.class.getName())) {
            drawCircle(shape);
        }
        if (name.equals(Rectangle.class.getName())) {
            drawRectangle(shape);
        }
    }

    void drawCircle(IDrawable shape){

    }

    void drawRectangle(IDrawable shape){

    }
}
