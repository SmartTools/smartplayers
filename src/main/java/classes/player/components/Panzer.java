package classes.player.components;

import interfaces.player.components.IPanzer;
import interfaces.player.control.IRemoteControl;
import interfaces.player.components.ITarget;
import classes.game.GameObject;

/**
 * Panzer's class
 */
public class Panzer extends GameObject implements IPanzer {

    IRemoteControl control;
    ITarget target;

    public Panzer(final IRemoteControl control, final ITarget target) {
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
