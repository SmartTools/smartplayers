import java.util.ArrayList;

/**
 * Created by byzilio on 20.07.15.
 */
public interface InformationObject {
    int getX();
    int getY();

    int getVX();
    int getVY();

    int size();

    void setInformation(ArrayList<Panzar> gameObjects);
}
