package classes.game.command;

import game.api.geometry.Vector;
import interfaces.game.ICommand;
import game.api.component.ITarget;
import utils.IPropertySource;
import utils.PropertyUtils;

import java.io.IOException;

/**
 * Rotate right command class
 */
public class RotateRightCommand implements ICommand {

    private ITarget target;
    private Integer angle;
    private final static String ANGLE_PROPERTY = "angle.right-rotate";

    public RotateRightCommand(final ITarget obj) throws IOException {
        IPropertySource propertyUtils = new PropertyUtils();
        this.angle = Integer.parseInt(propertyUtils.getProperty(ANGLE_PROPERTY));
        this.target = obj;
    }

    @Override
    public void action() {
        Vector<Double> direction = this.target.getDirection();
        Vector<Double> oldDirection = new Vector<>(direction.getX().doubleValue(), direction.getY().doubleValue());
        direction.setX(Math.cos(this.angle) * oldDirection.getX() + Math.sin(this.angle) * oldDirection.getY());
        direction.setY(- Math.sin(this.angle) * oldDirection.getX() + Math.cos(this.angle) * oldDirection.getX());
    }
}
