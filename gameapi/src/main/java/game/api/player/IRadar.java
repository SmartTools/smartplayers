package game.api.player;

import game.api.component.ITarget;

import java.util.Iterator;

/**
 * Radar contains game targets.
 */
public interface IRadar {
    Iterator<ITarget> getTargets();
}
