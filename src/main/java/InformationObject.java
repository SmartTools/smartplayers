import java.util.ArrayList;

/**
 * Created by byzilio on 20.07.15.
 * Интерфейс  информации , важной для игры
 */
public interface InformationObject {
    int getX();    // Положение на карте
    int getY();

    //Vector getVector(); // вектор напраления
    int getVX();
    int getVY();

    int getSpeed();  // Скорость объекта

    int getSize();  // Размер объекта

    void setInformation(ArrayList<Panzer> gameObjects);
}
