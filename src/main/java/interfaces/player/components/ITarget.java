package interfaces.player.components;

import classes.player.components.geometry.Point;
import interfaces.player.components.geometry.IShape;
import classes.player.components.geometry.Vector;

/**
 * Game targets
 */
public interface ITarget {

    Point<Integer> getLocation();
    Vector<Double> getDirection();
    Integer getSpeed();
    IShape getShape();

}
