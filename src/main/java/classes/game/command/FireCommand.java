package classes.game.command;

import interfaces.game.ICommand;
import interfaces.player.components.ITarget;

/**
 * Fire command.
 */
public class FireCommand implements ICommand {

    ITarget obj;

    public FireCommand(final ITarget obj) {
        this.obj = obj;
    }

    public ITarget action() {
        return null;
    }
}
