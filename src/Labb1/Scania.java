package Labb1;

import java.awt.*;

public class Scania extends Truck{
    private int PlatformAngle = 0;



    public Scania(){
        super(2, 125, 0,10, "Scania");
    };

    public void LowerPlatform (){
        if (PlatformAngle < 70){
        PlatformAngle += 5;}
    }

    public void RaisePlatform (){
        if (PlatformAngle > 0) {
            PlatformAngle -= 5;
        }
    }



    @Override
    public double getSpeedFactor() {
        return 0;
    }

}
