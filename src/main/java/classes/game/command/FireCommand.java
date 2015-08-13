package classes.game.command;

import interfaces.game.ICommand;
import interfaces.game.IGameField;
import interfaces.game.IGameObject;
import interfaces.player.components.ITarget;

import java.util.function.Function;

/**
 * Fire command.
 */
public class FireCommand implements ICommand {

    ITarget obj;
    Function<IGameObject , IGameObject> creator;

    public FireCommand(final ITarget obj, Function<IGameObject , IGameObject> creator) {
        this.obj = obj;
        this.creator = creator;
    }

    public ITarget action() {
        return obj;
    }

}
