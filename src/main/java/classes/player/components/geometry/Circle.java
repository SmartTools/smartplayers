package classes.player.components.geometry;

/**
 * Circle
 */
public class Circle extends Shape {

    private Point center;
    private int radius;

    public Circle(final Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public void setCenter(final Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
