package game.api.component;

/**
 * Interface for remote control
 */
public interface IRemoteControl {
    void move();
    void rotateLeft();
    void rotateRight();
    void fire();
    void stop();
}
