package classes.player.control;

import classes.game.command.*;
import interfaces.game.ICommand;
import interfaces.game.ICommandSource;
import interfaces.game.IGameObject;
import interfaces.player.control.IRemoteControl;
import interfaces.player.components.ITarget;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * RemoteControl class. Uses for player's interface and for making game steps in IGameField implementation.
 */
public class RemoteControl implements IRemoteControl, ICommandSource {

    private ICommand command;
    private IGameObject gameObject;
    private Supplier<IGameObject> creator;

    public RemoteControl(final IGameObject gameObject, Supplier<IGameObject> creator) {
        this.gameObject = gameObject;
        this.creator = creator;
    }

    @Override
    public void move() {
        if(command == null){
            command = new MoveCommand(this.gameObject);
        }
    }

    @Override
    public void rotateLeft() {
        if(command == null) {
            command = new RotateLeftCommand(this.gameObject);
        }
    }

    @Override
    public void rotateRight() {
        if(command == null) {
            command = new RotateRightCommand(this.gameObject);
        }
    }

    @Override
    public void fire() {
        if(command == null) {
            command = new FireCommand(this.gameObject, this.creator);
        }
    }

    @Override
    public void stop() {
        command = new StopCommand(this.gameObject);
    }

    @Override
    public ICommand command() {
        ICommand command = this.command;
        this.command = null;
        return command;
    }
}
