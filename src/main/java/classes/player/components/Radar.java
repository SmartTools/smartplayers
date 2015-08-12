package classes.player.components;

import interfaces.game.IGameObjectIteratorDecorator;
import interfaces.player.components.IRadar;
import interfaces.player.components.ITarget;

import java.util.Iterator;

/**
 * Radar
 */
public class Radar implements IRadar {

    private Iterator<ITarget> targets;

    public Radar(IGameObjectIteratorDecorator<ITarget> targets) {
        this.targets = targets;
    }

    public Iterator<ITarget> getTargets() {
        return targets;
    }

}
