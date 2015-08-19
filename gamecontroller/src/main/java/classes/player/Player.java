package classes.player;

import interfaces.player.IPlayer;
import game.api.player.IStrategy;

/**
 * Player's class
 */
public class Player implements IPlayer {

    private IStrategy strategy;
    private String name;

    public Player(final IStrategy strategy, final String name) {
        this.strategy = strategy;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IStrategy getStrategy() {
        return strategy;
    }
}
