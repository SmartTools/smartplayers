package classes.player.components;

import interfaces.player.components.IRadar;
import interfaces.player.components.ITarget;

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
