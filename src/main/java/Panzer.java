/**
 * Created by byzilio on 20.07.15.
 * Интерфейс непосредственно танка, все функции изменяют переменную типа Command , n/
 */
public interface Panzer extends InformationObject , UpdateableObject , ViewableObject{

    void move();
    void rotateLeft();
    void rotateRight();
    void stop();
    void shot();

}
