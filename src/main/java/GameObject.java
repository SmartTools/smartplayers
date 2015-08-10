import interfaces.IGameObject;

/**
 * Created by kkp on 10.08.15.
 */
public class GameObject implements IGameObject{
    String[] keys;

    public boolean has(String key) {
        for(String k:keys)if(key == k)return true;
        return false;
    }

    public String[] getKey() {
        return keys;
    }
}
