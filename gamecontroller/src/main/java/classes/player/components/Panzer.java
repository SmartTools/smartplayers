package classes.player.components;

import game.api.component.IHealth;
import game.api.component.IPetrol;
import game.api.component.IRemoteControl;
import game.api.component.ITarget;
import game.api.player.IPanzer;
import interfaces.player.IOwnership;

/**
 * Panzer's class
 */
public class Panzer implements IPanzer {

    private IRemoteControl control;
    private ITarget target;
    private IHealth health;
    private IPetrol petrol;

    public Panzer(
        final IRemoteControl control,
        final ITarget target,
        final IHealth health,
        final IPetrol petrol
    ) {
        this.control = control;
        this.target = target;
        this.health = health;
        this.petrol = petrol;
    }


    public ITarget getTarget() {
        return target;
    }

    public IRemoteControl getControl() {
        return control;
    }

    public IHealth getHealth() {
        return health;
    }

    public IPetrol getPetrol() {
        return petrol;
    }
}
