package interfaces.player;

import interfaces.player.strategy.IStrategy;

/**
 * PLayer interface
 */
public interface IPlayer {
    String getName();
    IStrategy getStrategy();
}
