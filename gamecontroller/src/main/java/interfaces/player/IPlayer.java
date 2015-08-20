package interfaces.player;

import game.api.player.IStrategy;

/**
 * PLayer interface
 */
public interface IPlayer {
    String getName();
    IStrategy getStrategy();
}
