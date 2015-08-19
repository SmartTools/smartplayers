package classes.game.command;

import classes.player.components.geometry.Point;
import classes.player.components.geometry.Vector;
import interfaces.game.ICommand;
import interfaces.player.components.ITarget;

import java.util.function.Consumer;

/**
 * Move command class
 */
public class MoveCommand implements ICommand {

    private ITarget target;
//    private Consumer<ITarget> rules;

    public MoveCommand(final ITarget obj) {
        this.target = obj;
    }

    @Override
    public void action() {
        Vector<Double> direction = this.target.getDirection();
        Point<Integer> location = this.target.getLocation();
        Integer speed = this.target.getSpeed();


        Point<Integer> startPoint = new Point<>(
            location.getX().intValue(), location.getY().intValue()
        );
        Point<Integer> endPoint = new Point<>(
            location.getX() + (int) (direction.getX() * (double) speed),
            location.getY() + (int) (direction.getY() * (double) speed)
        );

        location.setX(location.getX() + (int) (direction.getX() * (double) speed));
        location.setY(location.getY() + (int) (direction.getY() * (double) speed));
        //TODO: delete this log
        System.out.println(target.getLocation().toString());
    }

}
