package classes.game.command;

import interfaces.game.ICommand;
import interfaces.game.IGameObject;
import game.api.component.ITarget;

import java.util.function.Supplier;

/**
 * Fire command.
 */
public class FireCommand implements ICommand {

    private ITarget target;
    private Supplier<IGameObject> creator;

    public FireCommand(final ITarget target, final Supplier<IGameObject> creator) {
        this.target = target;
        this.creator = creator;
    }

    @Override
    public void action() {
        IGameObject bullet = this.creator.get();
        // set up properties
    }
}
