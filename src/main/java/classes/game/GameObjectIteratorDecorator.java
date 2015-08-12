package classes.game;

import interfaces.game.IGameObject;
import interfaces.game.IGameObjectIteratorDecorator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;

/**
 * Game object iterator decorator
 */
public class GameObjectIteratorDecorator<T> implements IGameObjectIteratorDecorator {

    private Iterator<IGameObject> objects;
    private String key;
    private Function<IGameObject, T> transform;

    public GameObjectIteratorDecorator(final Iterator<IGameObject> objects, final String key) {
        this.objects = objects;
        this.key = key;
    }

    public GameObjectIteratorDecorator(final Iterator<IGameObject> objects, final String key, final Function<IGameObject, T> transform) {
        this.objects = objects;
        this.key = key;
        if (transform != null) {
            this.transform = transform;
        } else {
            this.transform = (IGameObject obj) -> (T) obj.getKey(key);
        }
    }

    /**
     * Checks whether objects have appropriate GameObject
     * @return true is it has, false otherwise
     */
    public boolean hasNext() {

        while(objects.hasNext()) {
            if (objects.next().has(key)) {
                return true;
            }
        }
        return false;

    }

    public T next() {

        //TODO: check
        while(objects.hasNext()) {
            if (objects.next().has(key)) {
                return (T)objects.next();
            }
        }
        throw new NoSuchElementException("No such element");

    }
}
