package game.api.component;

import game.api.geometry.Point;
import game.api.geometry.IShape;
import game.api.geometry.Vector;

/**
 * Game targets
 */
public interface ITarget {

    Point<Integer> getLocation();
    Vector<Double> getDirection();
    Integer getSpeed();
    IShape getShape();

}
