package player.acces;

import command.FireCommand;
import command.MoveCommand;
import command.RotateLeftCommand;
import command.RotateRightCommand;
import interfaces.logic.ICommand;
import interfaces.player.acces.IRemoteControl;
import interfaces.player.acces.ITarget;

/**
 * Created by kkp on 07.08.15.
 */
public class RemoteControl implements IRemoteControl,ICommand {
    ICommand command;

    ITarget target;
    public void move() {
        if(command == null){
            command = new MoveCommand();
        }
    }

    public void rotateLeft() {
        if(command == null){
            command = new RotateLeftCommand();
        }
    }

    public void rotateRight() {
        if(command == null){
            command = new RotateRightCommand();
        }
    }

    public void fire() {
        if(command == null){
            command = new FireCommand();
        }
    }

    public void stop() {
        command = null;
    }

    public ITarget action() {
        return null;
    }
}
