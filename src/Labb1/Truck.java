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
        this.isMoving = false;
        this.platformAngle = 0;

    }

    @Override
    public double getSpeedFactor() {
        if (platformAngle == 0) {
            return getEnginePower() * 0.01;
        }
        else{
            return 0;
        }
    }

    private void UpdateMovement(){
        if (getCurrentSpeed() > 0){isMoving = true;}
        else{isMoving = false;}
    }


    abstract public void LowerPlatform ();

    abstract public void RaisePlatform ();

    public boolean getisMoving(){
        UpdateMovement();
        return isMoving;
    }

    public double getPlatformAngle(){return platformAngle;}

    public int getLength(){
        return length;
    }
}
