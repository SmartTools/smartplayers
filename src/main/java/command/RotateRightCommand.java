package command;

import interfaces.logic.ICommand;
import interfaces.player.acces.ITarget;

/**
 * Created by kkp on 11.08.15.
 */
public class RotateRightCommand implements ICommand {

    ITarget obj;

    public RotateRightCommand(ITarget obj) {
        this.obj = obj;
    }

    public ITarget action() {
        return null;
    }
}
