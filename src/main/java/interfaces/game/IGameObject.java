package interfaces.game;

/**
 * Game object interface. GameObject is any object on the game field
 */
public interface IGameObject {

    boolean has(String key);
    Object getKey(String key);
    Object put(String key, Object obj);

}
