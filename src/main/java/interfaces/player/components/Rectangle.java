package interfaces.player.components;

/**
 * Created by kkp on 11.08.15.
 */
public class Rectangle extends Shape {
    Point angle;
    Point displacement;

    public Rectangle(Point angle, Point displacement) {
        this.angle = angle;
        this.displacement = displacement;
    }

    public void setDisplacement(Point displacement) {
        this.displacement = displacement;
    }

    public void setAngle(Point angle) {
        this.angle = angle;
    }

}
