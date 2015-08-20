package utils.classload;

import java.io.FileNotFoundException;

/**
 * Interface for class loaders which load from jars
 */
public interface IJarClassLoader<T> {
    T load(String jarName) throws FileNotFoundException, ClassNotFoundException, GeneralLoaderException;
}
