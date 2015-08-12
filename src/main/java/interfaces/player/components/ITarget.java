package interfaces.player.components;

import classes.player.components.geometry.Point;
import classes.player.components.geometry.Shape;

/**
 * Game targets
 */
public interface ITarget {

    Point getLocation();
    Point getDirection();
    int getSpeed();
    Shape getShape();

}
