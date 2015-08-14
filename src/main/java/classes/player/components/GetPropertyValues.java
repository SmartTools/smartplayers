package classes.player.components;

/**
 * Created by kkp on 13.08.15.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class GetPropertyValues {
    InputStream inputStream;

    public String getValue(String name) throws Exception {

        try {
            Properties prop = new Properties();
            String propFileName = "config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            return prop.getProperty(name);
        } catch (Exception e) {
            throw new IOException();
        } finally {
            inputStream.close();
        }
    }
}