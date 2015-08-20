package classes.player.components.geometry;

import game.api.geometry.Point;
import game.api.geometry.Shape;

/**
 * Circle
 */
public class Circle extends Shape {

    private Point<Integer> center;
    private Integer radius;

    public Circle(final Point<Integer> center, final Integer radius) {
        this.center = center;
        this.radius = radius;
    }

    public void setCenter(final Point center) {
        this.center = center;
    }

    public void setRadius(final Integer radius) {
        this.radius = radius;
    }
}
