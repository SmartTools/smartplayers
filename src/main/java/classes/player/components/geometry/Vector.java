package classes.player.components.geometry;

/**
 * Vector class
 */
public class Vector<T extends Number> {
    private T x;
    private T y;

    public Vector(final T x, final T y) {
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

    public Double length() {
        return Math.sqrt((x.doubleValue() * x.doubleValue()) + (y.doubleValue() * y.doubleValue()));
    }
}
