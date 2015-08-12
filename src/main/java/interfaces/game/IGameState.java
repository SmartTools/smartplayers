package interfaces.game;

import interfaces.player.components.IPanzer;
import interfaces.player.components.IRadar;

import java.util.Iterator;

/**
 * Game state. Reflects game's state in appropriate time.
 */
public interface IGameState {
    IRadar getRadar();
    Iterator<IPanzer> getControl();
}
