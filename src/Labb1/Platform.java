package Labb1;

/**
 * @JosefJakobson
 * @JonathanSvantesson
 * @JonathanEdenlund
 *
 *  An interface that contains all methods needed by classes that use platforms.
 */
public interface Platform {
    /**
     * Will increase the angle of the platform
     */
    public void RaisePlatform();


    /**
     * Will decrease the angle of the platform
     */
    public void LowerPlatform();
}
