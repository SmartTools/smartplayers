package classes.player.control;

import classes.game.command.*;
import interfaces.game.ICommand;
import interfaces.game.ICommandSource;
import interfaces.player.control.IRemoteControl;
import interfaces.player.components.ITarget;

/**
 * RemoteControl class. Uses for player's interface and for making game steps in IGameField implementation.
 */
public class RemoteControl implements IRemoteControl, ICommandSource {

    private ICommand command;
    private ITarget target;

    @Override
    public void move() {
        if(command == null){
            command = new MoveCommand(this.target);
        }
    }

    @Override
    public void rotateLeft() {
        if(command == null) {
            command = new RotateLeftCommand(this.target);
        }
    }

    @Override
    public void rotateRight() {
        if(command == null) {
            command = new RotateRightCommand(this.target);
        }
    }

    @Override
    public void fire() {
        if(command == null) {
            command = new FireCommand(this.target);
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
