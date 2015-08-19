package classes.player.components.geometry;

import interfaces.player.components.geometry.IShape;

/**
 * Rectangle
 */
public class Rectangle<T extends Number> implements IShape {

    private Point<T> leftTop;
    private T height;
    private T width;

    public Rectangle(
        final Point<T> leftTop,
        final T height,
        final T width
    ) {
        this.leftTop = leftTop;
        this.height = height;
        this.width = width;
    }

    public Point<T> getLeftTop() {
        return leftTop;
    }

    public T getHeight() {
        return height;
    }

    public T getWidth() {
        return width;
    }
}
