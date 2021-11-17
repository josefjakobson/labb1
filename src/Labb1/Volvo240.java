package Labb1;
import java.awt.*;

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;


    public Volvo240(){
        super(4, 100, 0, Color.BLACK, "Volvo240");
        stopEngine();
    }

    @Override
    public double getSpeedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

}
