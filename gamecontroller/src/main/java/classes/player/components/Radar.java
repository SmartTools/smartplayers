package classes.player.components;

import game.api.player.IRadar;
import game.api.component.ITarget;

import java.util.Iterator;

/**
 * Radar
 */
public class Radar implements IRadar {

    private Iterator<ITarget> targets;

    public Radar(final Iterator<ITarget> targets) {
        this.targets = targets;
    }

    @Override
    public Iterator<ITarget> getTargets() {
        return targets;
    }

}
