package classes.game.command;

import interfaces.game.ICommand;
import interfaces.game.IGameObject;
import interfaces.player.components.ITarget;

/**
 * Stop command
 */
public class StopCommand implements ICommand {

    private IGameObject obj;

    public StopCommand(final IGameObject obj) {
        this.obj = obj;
    }

    @Override
    public void action() {
        return;
    }
}
