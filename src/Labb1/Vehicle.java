package Labb1;


/**
 * @JosefJakobson
 * @JonathanSvantesson
 * @JonathanEdenlund
 * A superclass that contains all necessary methods and attributes that all Vehicles should have.
 *
 * To access attributes, external methods will have to use getters and setters. This is to protect variables from being
 * changed or accessed unless explicitly necessary.
 *
 * The class is abstract and will not allow direct instances of type Vehicle to be created.
 */
public abstract class Vehicle implements Movable{
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private double positionX;
    private double positionY;
    private String direction;


    /**
     * A constructor that passes down all attributes to subclasses of Vehicle
     * @param nrDoors is the value of the number of doors that an instance of a subclass has.
     * @param enginePower is the max speed that an instance of a subclass has.
     * @param currentSpeed is the value of the current speed of the object
     */
    public Vehicle(int nrDoors, double enginePower, double currentSpeed){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.positionX = 0;
        this.positionY = 0;
        this.direction = "Up";
    }

    /**
     * Gets the current direction that the vehicle is facing
     * @return the direction
     */
    public String getDirection(){return direction;}


    /**
     * Gets the value of the nrDoors attribute
     * @return the value of the nrDoors variable
     */
    public int getNrDoors() {
        return nrDoors;
    }


    /**
     * Gets the value of the enginePower attribute
     * @return the value of the enginePower variable
     */
    public double getEnginePower() {
        return enginePower;
    }


    /**
     * Gets the value of the currentSpeed attribute
     * @return the value of the currentSpeed variable
     */
    public double getCurrentSpeed() {
        return currentSpeed;
    }


    /**
     * Gets the value of the current position of the object
     * @return the values of the X and Y coordinates
     */
    public double[] getCoordinates(){
        return new double[] {positionX, positionY};
    }


    /**
     * Gets the value of the positionX attribute
     * @return the value of the positionX variable
     */
    public double getPositionX(){
        return positionX;
    }


    /**
     * Gets the value of the positionY attribute
     * @return the value of the positionY variable
     */
    public double getPositionY(){
        return positionY;
    }


    /**
     * Sets the value of the positionX attribute
     * @param xPos the value that positionX should be set to
     */
    public void setPositionX(double xPos) {
        this.positionX = xPos;
    }

    /**
     * Sets the value of the positionY attribute
     * @param yPos the value that positionY should be set to
     */
    public void setPositionY(double yPos) {
        this.positionY = yPos;
    }


    /**
     * Sets the value of the currentSpeed attribute to 0.1
     */
    public void startEngine() {
        currentSpeed = 0.1;
    }


    /**
     * Sets the value of the currentSpeed attribute to 0
     */
    public void stopEngine() {
        currentSpeed = 0;
    }


    abstract public double getSpeedFactor();

    private void increaseSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed()  + getSpeedFactor() * amount,enginePower); // Current speed is set to the lowest of amount and enginePower, making sure currentSpeed never exceeds enginePower
    }

    private void decreaseSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - getSpeedFactor() * amount,0); // Current speed is set to the largest of amount and 0, making sure the speed never falls below zero
    }


    /**
     * Increases the currentSpeed attribute based on speedFactor, currentSpeed and the parameter amount
     * @param amount a variable that is either 1 or 0
     */
    public void gas(double amount){ // Double checks if amount is between 0 and 1 and increases speed
        if (amount < 0) {
            amount = 0;
        }
        else if (amount > 1) {
            amount = 1;
        }

        increaseSpeed(amount);
    }


    /**
     * Decreases the currentSpeed attribute based on speedFactor, currentSpeed and the parameter amount
     * @param amount a variable that is either 1 or 0
     */
    public void brake(double amount){
        if (amount < 0) {
            amount = 0;
        }
        else if (amount > 1) {
            amount = 1;
        }

        decreaseSpeed(amount);
    }


    /**
     * Calls on the move function
     */
    public void moveCall() {
        move();
    }


    /**
     * Changes the position of the object based on currentSpeed and direction
     */
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


    /**
     * Changes the direction of the object based on the current direction.
     */
    public void turnLeft(){
        switch (direction) {
            case "Up" -> direction = "Left";
            case "Down" -> direction = "Right";
            case "Right" -> direction = "Down";
            case "Left" -> direction = "Up";
        }
    }


    /**
     * Changes the direction of the object based on the current direction.
     */
    public void turnRight() {

        switch (direction) {
            case "Up" -> direction = "Right";
            case "Down" -> direction = "Left";
            case "Right" -> direction = "Down";
            case "Left" -> direction = "Up";
        }
    }


    /**
     * Gets the distance between two coordinates using pythagoras
     * @param coordinates1 the position of point 1
     * @param coordinates2 the position of point 2
     * @return the distance between the two given points
     */
    protected double getDistanceBetweenPoints(double[] coordinates1, double[] coordinates2) {

        return Math.abs(Math.sqrt(coordinates1[0] - coordinates2[0])+(coordinates1[1]-coordinates2[2]));
    }


}
