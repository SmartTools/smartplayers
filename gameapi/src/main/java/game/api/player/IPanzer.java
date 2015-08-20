package game.api.player;

import game.api.component.IHealth;
import game.api.component.IRemoteControl;
import game.api.component.ITarget;

/**
 * Panzer interface. Contains itself as target and remote control of itself.
 */
public interface IPanzer {
    ITarget getTarget();
    IRemoteControl getControl();
    IHealth getHealth();
}
