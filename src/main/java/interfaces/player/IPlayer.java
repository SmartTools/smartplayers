package interfaces.player;

import interfaces.player.strategy.IStrategy;

/**
 *
 */
public interface IPlayer {
    IStrategy getStrategy();
}
