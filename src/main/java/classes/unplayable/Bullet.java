package classes.unplayable;

import classes.game.command.BulletMoveCommand;
import interfaces.game.ICommand;
import interfaces.player.components.ITarget;
import classes.game.GameObject;

/**
 * Panzer's bullet class
 */
public class Bullet extends GameObject {
    ITarget target;
    ICommand command;

    public Bullet(final ITarget target) {
        this.command = new BulletMoveCommand(target);
        this.target = target;
    }
}

