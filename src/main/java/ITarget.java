/**
 * Created by byzilio on 20.07.15.
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
