package classes.player.components;

import interfaces.player.IOwnership;
import interfaces.player.components.IHealth;
import interfaces.player.components.IPanzer;
import interfaces.player.control.IRemoteControl;
import interfaces.player.components.ITarget;

/**
 * Panzer's class
 */
public class Panzer implements IPanzer {

    private IRemoteControl control;
    private ITarget target;
    private IOwnership ownership;
    private IHealth health;

    public Panzer(final IRemoteControl control, final ITarget target, final IOwnership ownership, final IHealth health) {
        this.control = control;
        this.target = target;
        this.ownership = ownership;
        this.health = health;
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

    public IHealth getHealth() {
        return health;
    }
}
