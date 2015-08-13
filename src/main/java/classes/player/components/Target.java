package classes.player.components;

import classes.player.components.geometry.Point;
import classes.player.components.geometry.Shape;
import interfaces.player.components.ITarget;

import java.util.Properties;


/**
 * Created by kkp on 07.08.15.
 */

public class Target implements ITarget {
    Point location;
    Point direction;
    int speed;
    Shape shape;
    public static int PanzerSize;
    public static int PanzerSpeed;
    public static int BulletSize;
    public static int BulletSpeed ;

    public Target() throws Exception {
        GetPropertyValues p = new GetPropertyValues();
        PanzerSize = (int) p.getValue("PanzerSize");
        PanzerSpeed = (int) p.getValue("PanzerSpeed");
        BulletSize = (int) p.getValue("BulletSize");
        BulletSpeed = (int) p.getValue("BulletSpeed");
    }

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
