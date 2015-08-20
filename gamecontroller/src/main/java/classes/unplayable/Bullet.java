package classes.unplayable;

import classes.game.command.MoveCommand;
import interfaces.game.ICommand;
import interfaces.game.IGameObject;

/**
 * Panzer's bullet class
 */
public class Bullet {

    private IGameObject obj;
    private ICommand command;

    public Bullet(final IGameObject obj) {
        this.command = new MoveCommand(obj);
        this.obj = obj;
    }
}

