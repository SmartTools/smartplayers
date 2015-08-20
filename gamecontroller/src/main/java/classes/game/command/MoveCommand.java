package classes.game.command;

import game.api.geometry.Point;
import game.api.geometry.Vector;
import interfaces.game.ICommand;
import game.api.component.ITarget;

/**
 * Move command class
 */
public class MoveCommand implements ICommand {

    private ITarget target;

    public MoveCommand(final ITarget obj) {
        this.target = obj;
    }

    @Override
    public void action() {
        Vector<Double> direction = this.target.getDirection();
        Point<Integer> location = this.target.getLocation();
        Integer speed = this.target.getSpeed();
        location.setX(location.getX() + (int)(direction.getX() * (double) speed));
        location.setY(location.getY() + (int) (direction.getY() * (double) speed));
        //TODO: delete this log
        System.out.println(target.getLocation().toString());
    }
}
