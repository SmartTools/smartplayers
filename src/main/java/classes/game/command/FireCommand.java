package classes.game.command;

import interfaces.game.ICommand;
import interfaces.player.components.ITarget;

/**
 * Fire command.
 */
public class FireCommand implements ICommand {

    private ITarget obj;

    public FireCommand(final ITarget obj) {
        this.obj = obj;
    }

    @Override
    public ITarget action() {
        return null;
    }

    public ITarget getObj() {
        return obj;
    }
}
