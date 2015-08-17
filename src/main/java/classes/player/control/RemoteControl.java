package classes.player.control;

import classes.game.command.*;
import interfaces.game.ICommand;
import interfaces.game.ICommandSource;
import interfaces.game.IGameObject;
import interfaces.player.control.IRemoteControl;
import interfaces.player.components.ITarget;

import java.io.IOException;
import java.util.function.Supplier;

/**
 * RemoteControl class. Uses for player's interface and for making game steps in IGameField implementation.
 */
public class RemoteControl implements IRemoteControl, ICommandSource {

    private ICommand command;
    private ITarget target;
    private Supplier<IGameObject> creator;

    public RemoteControl(final ITarget target, final Supplier<IGameObject> creator) {
        this.target = target;
        this.creator = creator;
    }

    @Override
    public void move() {
        if(command == null){
            command = new MoveCommand(this.target);
        }
    }

    @Override
    public void rotateLeft() {
        if(command == null) {
            try {
                command = new RotateLeftCommand(this.target);
            } catch (IOException e) {
                //TODO: to notify player
                command = new StopCommand(this.target);
            }
        }
    }

    @Override
    public void rotateRight() {
        if(command == null) {
            try {
                command = new RotateRightCommand(this.target);
            } catch (IOException e) {
                //TODO: to notify player
                command = new StopCommand(this.target);
            }
        }
    }

    @Override
    public void fire() {
        if(command == null) {
            command = new FireCommand(this.target, this.creator);
        }
    }

    @Override
    public void stop() {
        command = new StopCommand(this.target);
    }

    @Override
    public ICommand command() {
        ICommand command = this.command;
        this.command = null;
        return command;
    }
}
