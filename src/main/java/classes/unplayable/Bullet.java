package classes.unplayable;

import classes.game.command.MoveCommand;
import interfaces.game.ICommand;
import interfaces.game.IGameObject;
import interfaces.player.components.ITarget;

/**
 * Panzer's bullet class
 */
public class Bullet {

    private ITarget target;
    private ICommand command;

    public Bullet(final ITarget target) {
        this.command = new MoveCommand(target);
        this.target = target;
    }
}

