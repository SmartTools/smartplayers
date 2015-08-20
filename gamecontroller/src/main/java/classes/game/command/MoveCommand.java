package classes.game.command;

import game.api.component.ITarget;
import game.api.geometry.Point;
import game.api.geometry.Vector;
import interfaces.game.ICommand;
import interfaces.game.IGameObject;

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
        location.setX(location.getX() + (int) (direction.getX() * (double) speed));
        location.setY(location.getY() + (int) (direction.getY() * (double) speed));
        //TODO: delete this log
        System.out.println(target.getLocation().toString());
    }

}
