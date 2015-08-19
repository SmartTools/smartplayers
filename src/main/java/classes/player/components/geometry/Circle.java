package classes.player.components.geometry;

import interfaces.player.components.geometry.IShape;

/**
 * Circle
 */
public class Circle<T extends Number> implements IShape {

    private Point<T> center;
    private Integer radius;

    public Circle(final Point<T> center, final Integer radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point<T> getCenter() {
        return center;
    }

    public void setCenter(final Point<T> center) {
        this.center = center;
    }

    public Integer getRadius() {
        return radius;
    }
}
