package player.components;

import interfaces.player.components.ITarget;

import java.awt.*;

/**
 * Created by kkp on 07.08.15.
 */

public class Target implements ITarget {
    Point location;
    Point direction;
    int speed;
    int size;
    public static final int PanzerSize = 5;
    public static final int PanzerSpeed = 5;
    public static final int BulletSize = 1;
    public static final int BulletSpeed = 10;

    public Target(Point direction, Point location, int size, int speed) {
        this.direction = direction;
        this.location = location;
        this.size = size;
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

    public int getSize() {
        return size;
    }
}
