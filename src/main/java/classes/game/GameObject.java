package classes.game;

import interfaces.game.IGameObject;

import java.util.Map;

/**
 * GameObject object
 */
public class GameObject implements IGameObject {

    Map<String, Object> components;

    public boolean has(final String key) {
        if (components.get(key) != null) {
            return true;
        }
        return false;
    }

    public Object getKey(final String key) {
        return components.get(key);
    }
}
