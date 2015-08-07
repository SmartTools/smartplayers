package interfaces;

/**
 * Created by byzilio on 20.07.15.
 * интерфейс цели на радаре
 */
public interface ITarget {
    int getX();    // Положение на карте
    int getY();

    //Vector getVector(); // вектор напраления
    int getVX();
    int getVY();

    int getSpeed();  // Скорость объекта

    int getSize();  // Размер объекта

}
