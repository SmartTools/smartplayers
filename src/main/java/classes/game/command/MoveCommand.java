package classes.game.command;

import classes.player.components.Target;
import classes.player.components.geometry.Point;
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
        ITarget target = new Target(
            obj.getDirection(),
            new Point(obj.getLocation().getX() + obj.getDirection().getX() * Target.PanzerSpeed ,
                    obj.getLocation().getY() + obj.getDirection().getY() * Target.PanzerSpeed),
                obj.getShape(),
                Target.PanzerSpeed
        );
        return  obj;
    }

    public ITarget getObj() {
        return obj;
    }
}
