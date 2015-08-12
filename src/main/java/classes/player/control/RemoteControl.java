package classes.player.control;

import classes.game.command.FireCommand;
import classes.game.command.MoveCommand;
import classes.game.command.RotateLeftCommand;
import classes.game.command.RotateRightCommand;
import interfaces.game.ICommand;
import interfaces.player.control.IRemoteControl;
import interfaces.player.components.ITarget;

/**
 * RemoteControl class. Uses for player's interface and for making game steps in IGameField implementation.
 */
public class RemoteControl implements IRemoteControl, ICommand {

    ICommand command;
    ITarget target;

    public void move() {
        if(command == null){
            command = new MoveCommand(this.target);
        }
    }

    public void rotateLeft() {
        if(command == null) {
            command = new RotateLeftCommand(this.target);
        }
    }

    public void rotateRight() {
        if(command == null) {
            command = new RotateRightCommand(this.target);
        }
    }

    public void fire() {
        if(command == null) {
            command = new FireCommand(this.target);
        }
    }

    public void stop() {
        command = null;
    }

    public ITarget action() {
        ICommand command = this.command;
        this.command = null;
        return command.action();
    }
}
