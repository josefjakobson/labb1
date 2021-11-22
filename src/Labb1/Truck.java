package Labb1;

import java.awt.*;

public abstract class Truck extends Vehicle{

    private double platformAngle;
    private int length;
    public String modelName;


    public Truck(int nrDoors, double enginePower, double currentSpeed, int length, String modelName) {
        super(nrDoors, enginePower, currentSpeed);
        this.length = length;
        this.modelName = modelName;
    }

    @Override
    public double getSpeedFactor() {
        return 0;
    }
}
