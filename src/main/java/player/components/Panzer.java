package player.components;

import interfaces.player.components.IPanzer;
import interfaces.player.control.IRemoteControl;
import interfaces.player.components.ITarget;
import base.GameObject;

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
