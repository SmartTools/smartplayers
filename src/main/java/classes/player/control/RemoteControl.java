package classes.player.control;

import classes.game.command.FireCommand;
import classes.game.command.MoveCommand;
import classes.game.command.RotateLeftCommand;
import classes.game.command.RotateRightCommand;
import interfaces.game.ICommand;
import interfaces.game.ICommandSource;
import interfaces.game.IGameObject;
import interfaces.player.control.IRemoteControl;
import interfaces.player.components.ITarget;

import java.util.function.Function;

/**
 * RemoteControl class. Uses for player's interface and for making game steps in IGameField implementation.
 */
public class RemoteControl implements IRemoteControl, ICommandSource {

    ICommand command;
    ITarget target;
    Function<IGameObject , IGameObject> creator;
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
            command = new FireCommand(this.target , creator);
        }
    }

    @Override
    public void stop() {
        command = null;
    }

    @Override
    public ICommand command() {
        ICommand command = this.command;
        this.command = null;
        return command;
    }
}
