package interfaces.player.strategy;

import interfaces.game.IGameState;

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
