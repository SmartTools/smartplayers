package player.control;

import command.FireCommand;
import command.MoveCommand;
import command.RotateLeftCommand;
import command.RotateRightCommand;
import interfaces.logic.ICommand;
import interfaces.player.control.IRemoteControl;
import interfaces.player.components.ITarget;

/**
 * Created by kkp on 07.08.15.
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
            command = new RotateRightCommand();
        }
    }

    public void fire() {
        if(command == null) {
            command = new FireCommand();
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
