/**
 * Created by byzilio on 20.07.15.
 * Интерфейс управляемого игроком танка
 */
public interface Panzer{
    ITarget getTarget();
    IRemoteControl getControl();
}
