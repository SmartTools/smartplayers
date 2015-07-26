/**
 * An object that can move
 * Лист этих обьектов будет передаваться для управления алгоритмам
 */
public interface MoveableObject {
    void move();
    void rotateLeft();
    void rotateRight();
    void stop();
    int getCommand();
}
