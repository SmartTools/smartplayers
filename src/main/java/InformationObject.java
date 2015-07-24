import java.util.ArrayList;

/**
 * Created by byzilio on 20.07.15.
 */
public interface InformationObject {
    int getX();
    int getY();

    int getVX();
    int getVY();

    int getHealth();
    int getFuel();
    int getPlayer();

    void setInformation(ArrayList<GameObject> gameObjects);
}
