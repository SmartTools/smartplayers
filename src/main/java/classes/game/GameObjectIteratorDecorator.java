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
    private IGameObject current;
    private String key;
    private Function<IGameObject, T> transform;

    public GameObjectIteratorDecorator(final Iterator<IGameObject> objects, final String key) {
        this.key = key;
        this.objects = objects;
        this.transform = (IGameObject obj) -> (T) obj.getKey(key);
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

    @Override
    public boolean hasNext() {

        if (current != null) {
            return true;
        }
        while(objects.hasNext()) {
            current = objects.next();
            if (current.has(key)) {
                return true;
            }
        }
        current = null;

        return false;
    }

    @Override
    public T next() {

        if (current != null) {
            return this.retrieveCurrent();
        } else {
            while (objects.hasNext()) {
                current = objects.next();
                if (current.has(key)) {
                    return this.retrieveCurrent();
                }
            }
            current = null;
        }
        throw new NoSuchElementException("No such element");

    }

    private T retrieveCurrent() {
        T result = transform.apply(current);
        current = null;
        return result;
    }
}
