package classes.game.command;

import classes.player.components.geometry.Vector;
import interfaces.game.ICommand;
import interfaces.game.IGameObject;
import interfaces.player.components.ITarget;

/**
 * Rotate right command class
 */
public class RotateRightCommand implements ICommand {

    private IGameObject obj;
    private final static Integer ANGLE = 90;

    public RotateRightCommand(final IGameObject obj) {
        this.obj = obj;
    }

    @Override
    public void action() {
        ITarget target = (ITarget) obj.getKey("target");
        Vector<Double> direction = target.getDirection();
        direction.setX(Math.cos(ANGLE) * direction.getX() + Math.sin(ANGLE) * direction.getY());
        direction.setY(- Math.sin(ANGLE) * direction.getX() + Math.cos(ANGLE) * direction.getX());
    }
}
