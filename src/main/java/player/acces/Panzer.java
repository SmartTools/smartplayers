package player.acces;

import interfaces.player.acces.IPanzer;
import interfaces.player.acces.IRemoteControl;
import interfaces.player.acces.ITarget;
import logic.GameObject;

/**
 * Created by kkp on 10.08.15.
 */
public class Panzer extends GameObject implements IPanzer{
    IRemoteControl control;
    ITarget target;

    public ITarget getTarget() {
        return target;
    }

    public IRemoteControl getControl() {
        return control;
    }
}
