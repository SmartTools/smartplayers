package classes.game;

import interfaces.player.components.IPanzer;
import interfaces.player.components.IRadar;
import interfaces.game.IGameState;

import java.util.Iterator;

/**
 * State of game
 */
public class GameState implements IGameState {

    private IRadar radar;
    private Iterator<IPanzer> panzers;

    public GameState(final IRadar radar, final Iterator<IPanzer> panzers) {
        this.radar = radar;
        this.panzers = panzers;
    }

    @Override
    public IRadar getRadar() {
        return radar;
    }

    @Override
    public Iterator<IPanzer> getControl() {
        return panzers;
    }
}
