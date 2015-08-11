package interfaces.player.components;

import java.awt.*;

/**
 * Created by byzilio on 20.07.15.
 * интерфейс цели на радаре
 */
public interface ITarget {
    Point getLocation();    // Положение на карте

    Point getDirection();   // вектор напраления

    int getSpeed();  // Скорость объекта

    int getSize();  // Размер объекта

}
