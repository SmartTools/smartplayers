package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Class for working with .properties file
 */
public class PropertyUtils implements IPropertySource {

    private Properties properties;
    private final static String FILE_NAME = "constants.properties";


    public PropertyUtils() throws IOException {

        this.properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(FILE_NAME);

        if (inputStream != null) {
            try {
                this.properties.load(inputStream);
            } catch (FileNotFoundException e) {
                throw new IOException(e.getMessage());
            } finally {
                inputStream.close();
            }
        }

    }

    @Override
    public String getProperty(final String key) {
        return this.properties.getProperty(key);
    }
}
