package Labb1;

import java.awt.*;
import java.util.ArrayList;

/**
 * @JosefJakobson
 * @JonathanSvantesson
 * @JonathanEdenlund
 * A superclass that contains all necessary methods and attributes that all Trucks should have.
 *
 * To access attributes, external methods will have to use getters and setters. This is to protect variables from being
 * changed or accessed unless explicitly necessary.
 *
 * The class is abstract and will not allow direct instances of type Trucks to be created.
 */

public abstract class Truck extends Vehicle implements Platform{

    private int length;
    private String modelName;
    protected double platformAngle;
    private boolean isMoving;

    /**
     * Contains all attributes that are to be passed down to subclasses.
     * @param nrDoors is the value of the number of doors that an instance of a subclass has.
     * @param enginePower is the max speed that an instance of a subclass has.
     * @param currentSpeed is the value of the current speed of the object
     * @param length is the value of the length of the object
     * @param modelName is the model name of the object
     */


    public Truck(int nrDoors, double enginePower, double currentSpeed, int length, String modelName) {
        super(nrDoors, enginePower, currentSpeed, modelName);
        this.length = length;
        this.isMoving = false;
        this.platformAngle = 0;

    }

    /**
     * Overrides the method from the superclass Vehicle and checks the platforms position
     * @return speedFactor or 0 depending on the attribute platform angle
     */
    @Override
    public double getSpeedFactor() {
        if (platformAngle == 0) {
            isMoving = true;
            return getEnginePower() * 0.01;
        }
        else{
            return 0;
        }
    }

    /**
     * Changes the value of the attribute isMoving to True or False
     */
    private void UpdateMovement(){
        if (getCurrentSpeed() > 0){isMoving = true;}
        else{isMoving = false;}
    }


    abstract public void LowerPlatform ();

    abstract public void RaisePlatform ();

    /**
     * Gets the isMoving value.
     * @return isMoving value
     */
    public boolean getisMoving(){
        UpdateMovement();
        return isMoving;
    }


    /**
     * Gets the current angle of the platform
     * @return value of platformAngle
     */
    public double getPlatformAngle(){return platformAngle;}


    /**
     * Gets the length of the object
     * @return value of the length variable
     */
    public int getLength(){
        return length;
    }

}
