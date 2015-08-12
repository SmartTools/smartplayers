package classes.player.components.geometry;

/**
 * Rectangle
 */
public class Rectangle extends Shape {

    private Point leftTop;
    private int height;
    private int width;

    public Rectangle(Point leftTop, int height, int width) {
        this.leftTop = leftTop;
        this.height = height;
        this.width = width;
    }

    public Point getLeftTop() {
        return leftTop;
    }

    public void setLeftTop(final Point leftTop) {
        this.leftTop = leftTop;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
