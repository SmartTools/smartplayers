import java.util.ArrayList;

/**
 * Created by kkp on 27.07.15.
 */
public class PlayableObject implements MoveableObject , InformationObject, Panzer{

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public int getVX() {
        return 0;
    }

    public int getVY() {
        return 0;
    }

    public int getHealth() {
        return 0;
    }

    public int getFuel() {
        return 0;
    }

    public int getPlayer() {
        return 0;
    }

    public void setInformation(ArrayList<GameObject> gameObjects) {

    }

    public void shot() {

    }

    public boolean haveFuel() {
        return false;
    }

    public boolean onReload() {
        return false;
    }

    public void move() {

    }

    public void rotateLeft() {

    }

    public void rotateRight() {

    }

    public void stop() {

    }

    public int getCommand() {
        return 0;
    }
}
