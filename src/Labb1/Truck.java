package Labb1;

import java.awt.*;

public abstract class Truck extends Vehicle{

    private int length;
    private String modelName;
    private double platformAngle;
    private boolean isMoving;


    public Truck(int nrDoors, double enginePower, double currentSpeed, int length, String modelName) {
        super(nrDoors, enginePower, currentSpeed);
        this.length = length;
        this.modelName = modelName;
    }

    @Override
    public double getSpeedFactor() {
        return 0;
    }

    public boolean checkIfMoving(){
        if (getCurrentSpeed() > 0){isMoving = true;}
        else{isMoving = false;}
        return isMoving;
    }


    public void LowerPlatform (){
        if (platformAngle < 70){
            platformAngle += 5;}
    }

    public void RaisePlatform (){
        if (platformAngle > 0) {
            platformAngle -= 5;
        }
    }
}
