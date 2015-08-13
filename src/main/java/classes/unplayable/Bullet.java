package classes.unplayable;

import classes.game.command.MoveCommand;
import interfaces.game.ICommand;
import interfaces.player.components.ITarget;
import classes.game.GameObject;

/**
 * Panzer's bullet class
 */
public class Bullet extends GameObject {
    private ITarget target;
    private ICommand command;

    public Bullet(final ITarget target) {
        this.command = new MoveCommand(target);
        this.target = target;
    }
}

