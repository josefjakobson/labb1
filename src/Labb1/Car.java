package Labb1;
import java.awt.*;


public abstract class Car extends Vehicle {

    private Color color; // Color of the car
    private String modelName; // The car model name


    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        super(nrDoors, enginePower, currentSpeed);
        this.color = color;
        this.modelName = modelName;
    }


    public Color getColor() {
        return color;
    }


    public void setColor(Color clr) {
        color = clr;
    }
}
