package interfaces.player.components;

import java.util.Iterator;

/**
 * Radar contains game targets.
 */
public interface IRadar {
    Iterator<ITarget> getTargets();
}
