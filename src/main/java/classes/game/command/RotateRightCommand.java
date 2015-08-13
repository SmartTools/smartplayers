package classes.game.command;

import interfaces.game.ICommand;
import interfaces.player.components.ITarget;

/**
 * Rotate right command class
 */
public class RotateRightCommand implements ICommand {

    private ITarget obj;

    public RotateRightCommand(final ITarget obj) {
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
