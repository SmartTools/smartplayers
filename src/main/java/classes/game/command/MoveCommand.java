package classes.game.command;

import interfaces.game.ICommand;
import interfaces.player.components.ITarget;

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
