package classes.player.control;

import classes.game.command.*;
import interfaces.game.ICommand;
import interfaces.game.ICommandSource;
import interfaces.game.IGameObject;
import game.api.component.IRemoteControl;
import game.api.component.ITarget;

import java.io.IOException;
import java.util.function.Supplier;

/**
 * RemoteControl class. Uses for player's interface and for making game steps in IGameField implementation.
 */
public class RemoteControl implements IRemoteControl, ICommandSource {

    private ICommand command;
    private IGameObject obj;
    private Supplier<IGameObject> creator;

    public RemoteControl(final IGameObject obj, final Supplier<IGameObject> creator) {
        this.obj = obj;
        this.creator = creator;
    }

    @Override
    public void move() {
        if(command == null){
            command = new MoveCommand(this.obj);
        }
    }

    @Override
    public void rotateLeft() {
        if(command == null) {
            try {
                command = new RotateLeftCommand(this.obj);
            } catch (IOException e) {
                //TODO: to notify player
                command = new StopCommand(this.obj);
            }
        }
    }

    @Override
    public void rotateRight() {
        if(command == null) {
            try {
                command = new RotateRightCommand(this.obj);
            } catch (IOException e) {
                //TODO: to notify player
                command = new StopCommand(this.obj);
            }
        }
    }

    @Override
    public void fire() {
        if(command == null) {
            command = new FireCommand(this.obj, this.creator);
        }
    }

    @Override
    public void stop() {
        command = new StopCommand(this.obj);
    }

    @Override
    public ICommand command() {
        ICommand command = this.command;
        this.command = null;
        return command;
    }
}
