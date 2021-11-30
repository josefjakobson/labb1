package Labb1;
import java.awt.*;


/**
 * @JosefJakobson
 * @JonathanSvantesson
 * @JonathanEdenlund
 * A subclass of Car that contains all necessary methods and attributes that all Saab95 objects should have.
 *
 * To access attributes, external methods will have to use getters and setters. This is to protect variables from being
 * changed or accessed unless explicitly necessary.
 *
 */
public class Saab95 extends Car{

    private boolean turboOn;


    /**
     * Creates instance of Saab95 using attributes inherited from Car.
     */
    public Saab95(){
        super(2, 125, 0, Color.red, "Saab95");
        turboOn = false;
        stopEngine();
    }


    /**
     * Sets the turboOn variable to True
     */
    public void setTurboOn(){
        turboOn = true;
    }


    /**
     * Sets the turboOn variable to False
     */
    public void setTurboOff(){
        turboOn = false;
    }


    /**
     * Gets the turboOn variable
     * @return the value of turboOn
     */
    public boolean getTurboOn(){
        return turboOn;
    }


    /**
     * Calculates the value of the Volvo's speedFactor based on turbo
     * @return a value based on enginePower and turbo
     */
    @Override
    public double getSpeedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
}
