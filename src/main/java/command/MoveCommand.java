package command;

import interfaces.logic.ICommand;
import interfaces.player.acces.ITarget;

/**
 * Created by kkp on 07.08.15.
 */
public class MoveCommand implements ICommand {

    ITarget obj;

    public MoveCommand(ITarget obj) {
        this.obj = obj;
    }

    public ITarget action() {

        return  null;
    }
}
