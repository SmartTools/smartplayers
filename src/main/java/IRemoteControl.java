/**
 *  методы создают комманду танку
 */
public interface IRemoteControl{
    void move();
    void rotateLeft();
    void rotateRight();
    void fire();
    void stop();
}
