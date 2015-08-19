package classes.player.components.geometry;

import game.api.geometry.Point;
import game.api.geometry.Shape;

/**
 * Rectangle
 */
public class Rectangle extends Shape {

    private Point<Integer> leftTop;
    private Integer height;
    private Integer width;

    public Rectangle(final Point<Integer> leftTop, final Integer height, final Integer width) {
        this.leftTop = leftTop;
        this.height = height;
        this.width = width;
    }

    public Point<Integer> getLeftTop() {
        return leftTop;
    }

    public void setLeftTop(final Point<Integer> leftTop) {
        this.leftTop = leftTop;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final Integer height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(final Integer width) {
        this.width = width;
    }

    @Override
    public void setCenter(final Point point) {
        leftTop = point;
    }
}
