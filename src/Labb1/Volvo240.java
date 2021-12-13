package Labb1;
import java.awt.*;


/**
 * @JosefJakobson
 * @JonathanSvantesson
 * @JonathanEdenlund
 * A subclass of Car that contains all necessary methods and attributes that all Volvo240 objects should have.
 *
 * To access attributes, external methods will have to use getters and setters. This is to protect variables from being
 * changed or accessed unless explicitly necessary.
 *
 */
public class Volvo240 extends Car{

    private final static double trimFactor = 1.3;

    /**
     * Creates instance of Volvo240 using attributes inherited from Car.
     */
    public Volvo240(){
        super(4, 100, 0, Color.BLACK, "Volvo240");
        stopEngine();
    }


    /**
     * Calculates the value of the Volvo's speedFactor based on trimfactor
     * @return a value based on enginePower and trimfactor
     */
    @Override
    public double getSpeedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

}
