package classes.player.components;

import classes.player.components.geometry.Point;
import classes.player.components.geometry.Shape;
import interfaces.player.components.ITarget;


/**
 * Target on radar class
 */
public class Target implements ITarget {

    private Point location;
    private Point direction;
    private int speed;
    private Shape shape;
    //TODO: Out to .properties file
    public static final int PanzerSize = 5;
    public static final int PanzerSpeed = 5;
    public static final int BulletSize = 1;
    public static final int BulletSpeed = 10;

    public Target(final Point direction, final Point location, final Shape shape, int speed) {
        this.direction = direction;
        this.location = location;
        this.shape = shape;
        this.speed = speed;
    }


    @Override
    public Point getLocation() {
        return location;
    }

    @Override
    public Point getDirection() {
        return direction;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public Shape getShape() {
        return shape;
    }
}
