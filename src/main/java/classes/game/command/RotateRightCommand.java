package classes.game.command;

import classes.player.components.Target;
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
        Target target = new Target(
                obj.getDirection().rotate(Target.PanzerRotateSpeed),
                obj.getLocation(),
                obj.getShape(),
                0
        );
        return obj;
    }

    public ITarget getObj() {
        return obj;
    }
}
