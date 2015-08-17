package classes.player;

import interfaces.player.IOwnership;

/**
 * Ownership
 */
public class Ownership implements IOwnership {

    private String owner;

    public Ownership(final String owner) {
        this.owner = owner;
    }

    @Override
    public String getOwner() {
        return owner;
    }
}
