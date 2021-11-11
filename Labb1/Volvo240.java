package Labb1;

import java.awt.*;

public class Volvo240 extends Car{

    public final static double trimFactor = 1.25;

    
    public Volvo240(){
        super(4, 100, 0, Color.BLACK, "Volvo240");
        stopEngine();
    }
    
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed(), speedFactor(), amount);
    }

    public void decrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed(), -speedFactor(), amount);
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}
