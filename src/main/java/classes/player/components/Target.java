package classes.player.components;

import classes.player.components.geometry.Point;
import interfaces.player.components.geometry.IShape;
import classes.player.components.geometry.Vector;
import interfaces.player.components.ITarget;


/**
 * Target on radar class
 */
public class Target implements ITarget {

    /** Target's moment location */
    private Point<Integer> location;
    /** Normal vector of target direction */
    private Vector<Double> direction;
    private Integer speed;
    private IShape shape;

    public Target(final Vector<Double> direction, final Point<Integer> location, final IShape shape, final Integer speed) {
        this.direction = direction;
        this.location = location;
        this.shape = shape;
        this.speed = speed;
    }


    @Override
    public Point<Integer> getLocation() {
        return location;
    }

    @Override
    public Vector<Double> getDirection() {
        return direction;
    }

    @Override
    public Integer getSpeed() {
        return speed;
    }

    @Override
    public IShape getShape() {
        return shape;
    }
}
