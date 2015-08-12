package classes.player.components;

import classes.player.components.geometry.Point;
import classes.player.components.geometry.Shape;
import interfaces.player.components.ITarget;


/**
 * Created by kkp on 07.08.15.
 */

public class Target implements ITarget {
    Point location;
    Point direction;
    int speed;
    Shape shape;
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

    public Point getLocation() {
        return location;
    }

    public Point getDirection() {
        return direction;
    }

    public int getSpeed() {
        return speed;
    }

    public Shape getShape() {
        return this.shape;
    }
}
