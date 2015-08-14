package classes.game.command;

import interfaces.game.ICommand;
import interfaces.game.IGameObject;

import java.util.function.Supplier;

/**
 * Fire command.
 */
public class FireCommand implements ICommand {

    private IGameObject obj;
    Supplier<IGameObject> creator;

    public FireCommand(final IGameObject obj, final Supplier<IGameObject> creator) {
        this.obj = obj;
        this.creator = creator;
    }

    @Override
    public void action() {
        IGameObject bullet = creator.get();
        // set up properties
    }
}
