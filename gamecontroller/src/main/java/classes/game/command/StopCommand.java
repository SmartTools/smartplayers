package classes.game.command;

import interfaces.game.ICommand;
import game.api.component.ITarget;

/**
 * Stop command
 */
public class StopCommand implements ICommand {

    private ITarget target;

    public StopCommand(final ITarget target) {
        this.target = target;
    }

    @Override
    public void action() {
        return;
    }
}
