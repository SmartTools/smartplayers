/**
 * Created by byzilio on 20.07.15.
 * Интерфейс непосредственно танка, все функции изменяют переменную типа Command , n/
 */
public interface Panzer{
    ITarget getTarget();
    IRemoteControl getControl();
}
