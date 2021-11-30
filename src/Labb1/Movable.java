package Labb1;
/**
 * @JosefJakobson
 * @JonathanSvantesson
 * @JonathanEdenlund
 *
 *  An interface that contains all methods needed by classes that should be able to move.
 */
public interface Movable {

    /**
     * Will update position
     */
    void move();


    /**
     * Changes direction of object
     */
    void turnLeft();


    /**
     * Changes direction of object
     */
    void turnRight();

}
