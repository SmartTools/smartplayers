/**
 * An object that can move
 */
public interface ManagedObject {
    void move();
    void rotateLeft();
    void rotateRight();
    void fire();
    void stop();
    int getCommand();
}
