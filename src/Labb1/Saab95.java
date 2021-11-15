package Labb1;
import java.awt.*;

public class Saab95 extends Car{

    public boolean turboOn;


    public Saab95(){
        super(2, 125, 0, Color.red, "Saab95");
        turboOn = false;
        stopEngine();
    }

    public void setTurboOn(){
        turboOn = true;
    }

    public void setTurboOff(){
        turboOn = false;
    }

    @Override
    public double getSpeedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
}
