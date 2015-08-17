package classes.player.components;

import interfaces.player.components.IHealth;

/**
 * Class for health
 */
public class Health implements IHealth {

    private Integer health;

    public Health(final Integer health) {
        this.health = health;
    }

    @Override
    public Integer getValue() {
        return health;
    }

}
