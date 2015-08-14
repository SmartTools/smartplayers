package classes.player.components;

import interfaces.player.IOwnership;
import interfaces.player.components.IPanzer;
import interfaces.player.control.IRemoteControl;
import interfaces.player.components.ITarget;
import classes.game.GameObject;

/**
 * Panzer's class
 */
public class Panzer {

    private IRemoteControl control;
    private ITarget target;
    private IOwnership ownership;

    public Panzer(final IRemoteControl control, final ITarget target, final IOwnership iOwnership) {
        this.control = control;
        this.target = target;
        this.ownership = iOwnership;
    }


    public ITarget getTarget() {
        return target;
    }

    public IRemoteControl getControl() {
        return control;
    }

    public IOwnership getOwnership() {
        return ownership;
    }
}
