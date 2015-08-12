package interfaces.player.components;

import classes.player.components.geometry.Point;
import classes.player.components.geometry.Shape;

/**
 * Created by byzilio on 20.07.15.
 * интерфейс цели на радаре
 */
public interface ITarget {
    Point getLocation();    // Положение на карте

    Point getDirection();   // вектор напраления

    int getSpeed();  // Скорость объекта

    Shape getSize();  // Размер объекта

}
