package interfaces.player.control;

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
