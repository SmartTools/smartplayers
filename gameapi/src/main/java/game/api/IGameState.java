package game.api;

import game.api.player.IPanzer;
import game.api.player.IRadar;

import java.util.Iterator;

/**
 * Game state. Reflects game's state in appropriate time.
 */
public interface IGameState {
    IRadar getRadar();
    Iterator<IPanzer> getControl();
}
