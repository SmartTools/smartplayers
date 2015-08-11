package command;

import interfaces.logic.ICommand;
import interfaces.player.acces.ITarget;

/**
 * Created by kkp on 07.08.15.
 */
public class RotateLeftCommand implements ICommand {

    ITarget obj;

    public RotateLeftCommand(ITarget obj) {
        this.obj = obj;
    }

    public ITarget action() {
        return null;
    }
}
