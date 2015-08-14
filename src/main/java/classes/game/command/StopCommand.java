package classes.game.command;

import classes.player.components.Target;
import classes.player.components.geometry.Point;
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
        ITarget target = new Target(
            obj.getDirection(),
            obj.getLocation(),
            obj.getShape(),
            0
        );
        return  obj;
    }
}