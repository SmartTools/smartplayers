package command;

import interfaces.logic.ICommand;
import interfaces.player.acces.ITarget;

/**
 * Created by kkp on 11.08.15.
 */
public class FireCommand implements ICommand {

    ITarget obj;

    public FireCommand(ITarget obj) {
        this.obj = obj;
    }

    public ITarget action() {
        return null;
    }
}
