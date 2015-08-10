import interfaces.ICommand;
import interfaces.IRemoteControl;
import interfaces.ITarget;

/**
 * Created by kkp on 07.08.15.
 */
public class RemoteControl implements IRemoteControl {
    ICommand command;

    public void move() {
        if(command == null){
            command = new MoveCommand();
        }
    }

    public void rotateLeft() {
        if(command == null){
            command = new RotateCommand(RotateCommand.LEFT);
        }
    }

    public void rotateRight() {
        if(command == null){
            command = new RotateCommand(RotateCommand.RIGHT);
        }
    }

    public void fire() {
        if(command == null){
            command = new MoveCommand();
        }
    }

    public void stop() {
        command = null;
    }
}
