package classes.player.components.geometry;

/**
 * Created by kkp on 14.08.15.
 */
public class Vector {
    double x;
    double y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector rotate(int angle){
        x = x * Math.cos(angle*Math.PI/180) - y * Math.sin(angle*Math.PI/180);
        y = x * Math.sin(angle*Math.PI/180) + y * Math.cos(angle*Math.PI/180);
        return this;
    }
}
