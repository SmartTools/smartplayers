/**
 * Created by byzilio on 20.07.15.
 * В update выполняем команду
 */
public interface GameObject {
    void update();
    void takeCommand(MoveableObject moveableObject);
}
