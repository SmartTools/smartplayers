package classes.game.command;

import interfaces.game.ICommand;
import interfaces.player.components.ITarget;

/**
 * Move command class
 */
public class MoveCommand implements ICommand {

    private ITarget obj;

    public MoveCommand(final ITarget obj) {
        this.obj = obj;
    }

    @Override
    public ITarget action() {
        return  null;
    }

    public ITarget getObj() {
        return obj;
    }
}
