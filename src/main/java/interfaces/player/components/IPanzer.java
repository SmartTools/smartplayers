package interfaces.player.components;

import interfaces.player.IOwnership;
import interfaces.player.control.IRemoteControl;

/**
 * Panzer interface. Contains itself as target and remote control of itself.
 */
public interface IPanzer {
    ITarget getTarget();
    IRemoteControl getControl();
    IOwnership getOwnership();
}
