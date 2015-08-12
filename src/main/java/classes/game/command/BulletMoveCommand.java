package classes.game.command;

import interfaces.game.ICommand;
import interfaces.player.components.ITarget;

/**
 * Created by kkp on 11.08.15.
 */
public class BulletMoveCommand implements ICommand {

    ITarget obj;

    public BulletMoveCommand(ITarget obj) {
        this.obj = obj;
    }

    public ITarget action() {
        return null;
    }
}
