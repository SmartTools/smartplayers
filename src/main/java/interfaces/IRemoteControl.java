package interfaces;

/**
 *Интрефейс , создающий команды для изменения состояния
 */
public interface IRemoteControl{
    void move();
    void rotateLeft();
    void rotateRight();
    void fire();
    void stop();
}
