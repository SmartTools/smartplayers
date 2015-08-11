package player.components;

import interfaces.player.components.IPanzer;
import interfaces.player.control.IRemoteControl;
import interfaces.player.components.ITarget;
import base.GameObject;
import player.control.RemoteControl;

import java.awt.*;

/**
 * Created by kkp on 10.08.15.
 */
public class Panzer extends GameObject implements IPanzer{
    IRemoteControl control;
    ITarget target;

    public Panzer(IRemoteControl control, ITarget target) {
        this.control = control;
        this.target = target;
    }

    public ITarget getTarget() {
        return target;
    }

    public IRemoteControl getControl() {
        return control;
    }
}
