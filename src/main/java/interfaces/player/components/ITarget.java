package interfaces.player.components;

import classes.player.components.geometry.Point;
import classes.player.components.geometry.Shape;
import classes.player.components.geometry.Vector;

/**
 * Game targets
 */
public interface ITarget {

    Point<Integer> getLocation();
    Vector<Double> getDirection();
    Integer getSpeed();
    Shape getShape();

}
