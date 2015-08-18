package classes.player.components;

import interfaces.player.components.IPetrol;

/**
 * Petrol
 */
public class Petrol implements IPetrol {

    private Integer petrol;

    public Petrol(final Integer petrol) {
        this.petrol = petrol;
    }

    @Override
    public Integer getValue() {
        return petrol;
    }
}
