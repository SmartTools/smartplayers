package unplayable;

import command.BulletMoveCommand;
import interfaces.logic.ICommand;
import interfaces.player.components.ITarget;
import base.GameObject;

/**
 * Created by kkp on 10.08.15.
 */
public class Bullet extends GameObject {
    ITarget target;
    ICommand command;

    public Bullet(ITarget target) {
        this.command = new BulletMoveCommand(target);
        this.target = target;
    }
}

