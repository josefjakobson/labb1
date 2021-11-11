package Labb1;

import java.awt.*;


public class Car implements Movable{
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double positionX = 0;
    private double positionY = 0;
    private String direction = "Upp";

    protected Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
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
        switch (direction){
            case "Up":
                positionY += currentSpeed;
            case "Right":
                positionX += currentSpeed;
            case "Left":
                positionX -= currentSpeed;
            case "Down":
                positionY -= currentSpeed;
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
