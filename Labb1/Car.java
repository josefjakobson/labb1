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
    protected int[] position;
    protected String direction = "Upp";

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
        //public void keyPressed()

    }


    private void turnLeft(){ switch (direction) {
        case "Upp":
            direction = "Vanster";
        case "Ner":
            direction = "Hoger";
        case "Hoger":
            direction = "Ner";
        case "Vanster":
            direction = "Upp";
    }
    }


    private void turnRight() {

        switch (direction) {
            case "Upp":
                direction = "Hoger";
            case "Ner":
                direction = "Vanster";
            case "Hoger":
                direction = "Ner";
            case "Vanster":
                direction = "Upp";
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
