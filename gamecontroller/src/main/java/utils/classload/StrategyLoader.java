package utils.classload;

import game.api.player.IStrategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Load strategy from jar
 */
public class StrategyLoader implements IJarClassLoader<IStrategy>{

    private String dirPath;
    private String className;

    public StrategyLoader(final String dirPath, final String className) {
        this.dirPath = dirPath;
        this.className = className;
    }

    @Override
    public IStrategy load(final String jarName)
            throws FileNotFoundException, ClassNotFoundException, GeneralLoaderException
    {

        File jar = this.getJar(jarName);
        IStrategy instance;
        try {
            URL jarURL = jar.toURI().toURL();
            URLClassLoader classLoader = new URLClassLoader(new URL[]{jarURL});
            Class strategy = classLoader.loadClass(className);
            instance = (IStrategy) strategy.newInstance();
        } catch (MalformedURLException e) {
            throw new FileNotFoundException(dirPath + "/" + jarName + ".jar" + " isn't correct path");
        } catch (InstantiationException e) {
            throw new GeneralLoaderException("Instantiation of strategy class was corrupted: ", e);
        } catch (IllegalAccessException e) {
            throw new GeneralLoaderException("Illegal access for strategy class: ", e);
        }

        return instance;
    }

    private File getJar(final String jarName) throws FileNotFoundException{

        File pluginDir = new File(this.dirPath);
        File[] jar = pluginDir.listFiles(
                (File file) -> (file.isFile() && file.getName().equals(jarName + ".jar"))
        );
        if (jar.length == 0) {
            throw new FileNotFoundException(jarName + ".jar" + " not found");
        }

        return jar[0];
    }
}
