package Labb1;

import java.awt.*;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


public class Car implements Movable{
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    protected double positionX;
    protected double positionY;
    protected String direction;

    protected Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        positionX = 0;
        positionY = 0;
        direction = "Up";
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

    protected double[] getCoordinates(){
        return new double[] {positionY, positionX};
    }

    protected void setCurrentSpeed(double currentSpeed, double speedFactor, double amount){
        this.currentSpeed = getCurrentSpeed() + speedFactor * amount;
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
        switch (direction) {
            case "Up":
                positionY += currentSpeed;
                break;
            case "Down":
                positionY -= currentSpeed;
                break;
            case "Right":
                positionX += currentSpeed;
                break;
            case "Left":
                positionX -= currentSpeed;
                break;
            default:
                break;
        }
    }


    private void turnLeft(){ 
        switch (direction) {
            case "Up":
                direction = "Left";
            case "Down":
                direction = "Right";
            case "Right":
                direction = "Down";
            case "Left":
                direction = "Up";
        }
    }


    private void turnRight() {

        switch (direction) {
            case "Up":
                direction = "Right";
            case "Down":
                direction = "Left";
            case "Right":
                direction = "Down";
            case "Left":
                direction = "Up";
        }
    }
}
