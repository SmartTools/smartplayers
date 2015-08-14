package classes.player.components;

import classes.player.components.geometry.Point;
import classes.player.components.geometry.Shape;
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
    private Shape shape;
    //TODO: Out to .properties file
    public static final int PanzerSize = 5;
    public static final int PanzerSpeed = 5;
    public static final int BulletSize = 1;
    public static final int BulletSpeed = 10;

    public Target(final Vector<Double> direction, final Point<Integer> location, final Shape shape, int speed) {
        this.direction = direction;
        this.location = location;
        this.shape = shape;
        this.shape.setCenter(location);
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
    public Shape getShape() {
        return shape;
    }
}
