package classes.game.command;

import interfaces.game.ICommand;
import interfaces.player.components.ITarget;

/**
 * Rotate left command class
 */
public class RotateLeftCommand implements ICommand {

    private ITarget obj;

    public RotateLeftCommand(final ITarget obj) {
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
