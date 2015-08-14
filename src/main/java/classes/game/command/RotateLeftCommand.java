package classes.game.command;

import classes.player.components.Target;
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
        Target target = new Target(
            obj.getDirection().rotate(-Target.PanzerRotateSpeed),
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
