package Labb1;
import java.awt.*;


public abstract class Car implements Movable{
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
        this.positionX = 0;
        this.positionY = 0;
        this.direction = "Up";
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    protected void startEngine() {
        currentSpeed = 0.1;
    }

    protected void stopEngine() {
        currentSpeed = 0;
    }

    abstract public double getSpeedFactor();

    protected void increaseSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed()  + getSpeedFactor() * amount,enginePower); // Current speed is set to the lowest of amount and enginePower, making sure currentSpeed never exceeds enginePower
    }

    protected void decreaseSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - getSpeedFactor() * amount,0); // Current speed is set to the largest of amount and 0, making sure the speed never falls below zero
    }

    public void gas(double amount){ // Double checks if amount is between 0 and 1 and increases speed
        if (amount < 0) {
            amount = 0;
        }
        else if (amount > 1) {
            amount = 1;
        }

        increaseSpeed(amount);
    }

    public void brake(double amount){
        if (amount < 0) {
            amount = 0;
        }
        else if (amount > 1) {
            amount = 1;
        }

        decreaseSpeed(amount);
    }

    public void move(){
        switch (direction) {
            case "Up" -> positionY += currentSpeed;
            case "Down" -> positionY -= currentSpeed;
            case "Right" -> positionX += currentSpeed;
            case "Left" -> positionX -= currentSpeed;
            default -> {
            }
        }
    }


    public void turnLeft(){
        switch (direction) {
            case "Up" -> direction = "Left";
            case "Down" -> direction = "Right";
            case "Right" -> direction = "Down";
            case "Left" -> direction = "Up";
        }
    }


    public void turnRight() {

        switch (direction) {
            case "Up" -> direction = "Right";
            case "Down" -> direction = "Left";
            case "Right" -> direction = "Down";
            case "Left" -> direction = "Up";
        }
    }
}
