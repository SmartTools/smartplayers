package utils.classload;

/**
 * General exception for class loaders
 */
public class GeneralLoaderException extends Exception {

    public GeneralLoaderException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
