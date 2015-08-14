package classes.game.command;

import classes.player.components.geometry.Point;
import classes.player.components.geometry.Vector;
import interfaces.game.ICommand;
import interfaces.game.IGameObject;
import interfaces.player.components.ITarget;

/**
 * Move command class
 */
public class MoveCommand implements ICommand {

    private IGameObject obj;

    public MoveCommand(final IGameObject obj) {
        this.obj = obj;
    }

    @Override
    public void action() {
        ITarget target = (ITarget) obj.getKey("target");
        Vector<Double> direction = target.getDirection();
        Point<Integer> location = target.getLocation();
        Integer speed = target.getSpeed();
        location.setX(location.getX() + (int)(direction.getX() * (double) speed));
        location.setY(location.getY() + (int) (direction.getY() * (double) speed));
    }
}
