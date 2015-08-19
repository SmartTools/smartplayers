package classes.player.components.geometry;

import interfaces.player.components.geometry.IShape;

/**
 * Square
 */
public class Square<T extends Number> implements IShape {

    private Point<T> leftTop;
    private Integer side;

    public Square(final Point<T> leftTop, final Integer side) {
        this.leftTop = leftTop;
        this.side = side;
    }

    public Point<T> getLeftTop() {
        return leftTop;
    }

    public void setLeftTop(final Point<T> leftTop) {
        this.leftTop = leftTop;
    }

    public Integer getSide() {
        return side;
    }
}
