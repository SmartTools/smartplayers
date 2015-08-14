package classes.game.command;

import classes.player.components.geometry.Vector;
import interfaces.game.ICommand;
import interfaces.game.IGameObject;
import interfaces.player.components.ITarget;

/**
 * Rotate left command class
 */
public class RotateLeftCommand implements ICommand {

    private IGameObject obj;
    private final static Integer ANGLE = 90;

    public RotateLeftCommand(final IGameObject obj) {
        this.obj = obj;
    }

    @Override
    public void action() {
        ITarget target = (ITarget) obj.getKey("target");
        Vector<Double> direction = target.getDirection();
        direction.setX(Math.cos(ANGLE) * direction.getX() - Math.sin(ANGLE) * direction.getY());
        direction.setY(Math.sin(ANGLE) * direction.getX() + Math.cos(ANGLE) * direction.getX());
    }
}
