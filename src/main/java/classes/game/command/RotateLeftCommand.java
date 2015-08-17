package classes.game.command;

import classes.player.components.geometry.Vector;
import interfaces.game.ICommand;
import interfaces.player.components.ITarget;
import utils.PropertyUtils;

import java.io.IOException;

/**
 * Rotate left command class
 */
public class RotateLeftCommand implements ICommand {

    private ITarget target;
    private Integer angle;
    private final static String ANGLE_PROPERTY = "angle.left-rotate";

    public RotateLeftCommand(final ITarget obj) throws IOException {
        PropertyUtils propertyUtils = new PropertyUtils();
        this.angle = propertyUtils.getIntValue(ANGLE_PROPERTY);
        this.target = obj;
    }

    @Override
    public void action() {
        Vector<Double> direction = this.target.getDirection();
        Vector<Double> oldDirection = new Vector<>(direction.getX().doubleValue(), direction.getY().doubleValue());
        direction.setX(Math.cos(this.angle) * oldDirection.getX() - Math.sin(this.angle) * oldDirection.getY());
        direction.setY(Math.sin(this.angle) * oldDirection.getX() + Math.cos(this.angle) * oldDirection.getX());
    }
}
