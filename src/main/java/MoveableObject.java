/**
 * An object that can move
 */
public interface MoveableObject {
    void move();
    void rotateLeft();
    void rotateRight();
    void stop();
    int getCommand();
}
