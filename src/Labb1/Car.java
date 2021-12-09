package Labb1;
import java.awt.*;

/**
 * @JosefJakobson
 * @JonathanSvantesson
 * @JonathanEdenlund
 *
 *  A superclass that contains all necessary methods and attributes that all Cars should have.
 *
 *  To access attributes, external methods will have to use getters and setters. This is to protect variables from being
 *  changed or accessed unless explicitly necessary.
 *
 *  The class is abstract and will not allow direct instances of type Car to be created.
 */



public abstract class Car extends Vehicle {

    private Color color; // Color of the car
    private String modelName; // The car model name
    private boolean isloaded; //
    /**
     * Contains all the attribute that are passed down to the subclasses
     * @param nrDoors is the value of the number of doors that an instance of a subclass has.
     * @param enginePower is the max speed that an instance of a subclass has.
     * @param currentSpeed is the value of the current speed of the object
     * @param color is the color of the Car
     * @param modelName is the model name of the Car
     */
    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        super(nrDoors, enginePower, currentSpeed, modelName);
        this.color = color;
        this.isloaded = false;
    }

    /**
     * Get the value of the Color variable
     * @return value of the Color variable
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the value of the Color variable
     * @param clr the new Color
     */
    public void setColor(Color clr) {
        color = clr;
    }

    public void setIsloadedtrue(){isloaded = true;}

    public void setIsloadedfalse(){isloaded = false;}

    public boolean getisloaded(){return isloaded;}


}
