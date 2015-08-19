package game.api.player;

import game.api.IGameState;

/**
 * Player's strategy
 */
public interface IStrategy {
    /**
     * Make step with strategy from game state
     * @param state current game state
     */
    void step(IGameState state);
}
