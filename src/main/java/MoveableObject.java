/**
 * An object that can move
 * Лист этих обьектов будет передаваться для управления алгоритмам
 */
public interface MoveableObject {
    int getX();
    int getY();

    void setPanzar(Panzar panzar);

    void move();
    void rotateLeft();
    void rotateRight();
    void stop();
    void shot();
}
