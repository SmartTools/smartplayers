package interfaces.player.acces;

/**
 * Created by byzilio on 20.07.15.
 * Интерфейс управляемого игроком танка
 */
public interface IPanzer{
    ITarget getTarget();
    IRemoteControl getControl();
}
