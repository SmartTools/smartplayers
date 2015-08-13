package classes.game.command;

import interfaces.game.ICommand;
import interfaces.player.components.ITarget;

/**
 * Stop command
 */
public class StopCommand implements ICommand {

    private ITarget obj;

    public StopCommand(final ITarget target) {
        this.obj = target;
    }

    @Override
    public ITarget action() {
        return obj;
    }
}
