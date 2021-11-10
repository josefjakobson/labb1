package Labb1;

import java.awt.*;
import java.util.ArrayList;


public class Car implements Movable{
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name


    protected Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        position = new int[]{0, 0};
    }

    protected int getNrDoors() {
        return nrDoors;
    }

    protected double getEnginePower() {
        return enginePower;
    }

    protected double getCurrentSpeed() {
        return currentSpeed;
    }

    protected Color getColor() {
        return color;
    }

    protected void setColor(Color clr) {
        color = clr;
    }

    protected void startEngine() {
        currentSpeed = 0.1;
    }

    protected void stopEngine() {
        currentSpeed = 0;
    }

    protected void move(){

    }


    private void turnLeft(){

    }


    private void turnRight(){

    }

/*    protected void setNewPosition(){
        int currentX = position[1];
        int currentY = position[0];
        switch (direction){
            case "Upp":
                position = new int[]{currentY+1, currentX};
            case "Ner":
                position = new int[]{currentY-1, currentX};
            case "Hoger":
                position = new int[]{currentY, currentX + 1};
            case "Vanster":
                position = new int[]{currentY, currentX-1};
        }
    }*/
}
