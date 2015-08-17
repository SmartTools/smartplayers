package classes.player.components.geometry;

/**
 * Plane point
 */
public class Point<T extends Number> {

    private T x;
    private T y;

    public Point(final T x, final T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(final T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(final T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
