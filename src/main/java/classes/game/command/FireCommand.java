package classes.game.command;

import interfaces.game.ICommand;
import interfaces.game.IGameObject;
import interfaces.player.components.ITarget;

import java.util.function.Supplier;

/**
 * Fire command.
 */
public class FireCommand implements ICommand {

    private IGameObject obj;
    private Supplier<IGameObject> creator;

    public FireCommand(final IGameObject obj, final Supplier<IGameObject> creator) {
        this.obj = obj;
        this.creator = creator;
    }

    @Override
    public void action() {
        IGameObject bullet = this.creator.get();
        // set up properties
    }
}
