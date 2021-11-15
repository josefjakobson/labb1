package Labb1;

import java.awt.*;


public class Car implements Movable{
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    protected double positionX;
    protected double positionY;
    protected String direction;

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        positionX = 0;
        positionY = 0;
        direction = "Up";
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double[] getCoordinates(){
        return new double[] {positionY, positionX};
    }

    public void setCurrentSpeed(double currentSpeed, double speedFactor, double amount){
        this.currentSpeed = getCurrentSpeed() + speedFactor * amount;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
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
