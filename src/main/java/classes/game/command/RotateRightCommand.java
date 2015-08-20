package classes.game.command;

import classes.player.components.geometry.Vector;
import interfaces.game.ICommand;
import interfaces.game.IGameObject;
import interfaces.player.components.ITarget;
import utils.PropertyUtils;

import java.io.IOException;

/**
 * Rotate right command class
 */
public class RotateRightCommand implements ICommand {

    private IGameObject obj;
    private Integer angle;
    private final static String ANGLE_PROPERTY = "angle.right-rotate";

    public RotateRightCommand(final IGameObject obj) throws IOException {
        PropertyUtils propertyUtils = new PropertyUtils();
        this.angle = propertyUtils.getIntValue(ANGLE_PROPERTY);
        this.obj = obj;
    }

    @Override
    public void action() {
        ITarget target = (ITarget) obj.getKey("target");
        Vector<Double> direction = target.getDirection();
        Vector<Double> oldDirection = new Vector<>(direction.getX().doubleValue(), direction.getY().doubleValue());
        direction.setX(Math.cos(this.angle) * oldDirection.getX() + Math.sin(this.angle) * oldDirection.getY());
        direction.setY(- Math.sin(this.angle) * oldDirection.getX() + Math.cos(this.angle) * oldDirection.getX());
    }
}
