package Labb1;

import java.util.ArrayList;

/**
 * @JosefJakobson
 * @JonathanSvantesson
 * @JonathanEdenlund
 * A subclass of Truck that contains all necessary methods and attributes that all CarTransport objects should have.
 *
 * To access attributes, external methods will have to use getters and setters. This is to protect variables from being
 * changed or accessed unless explicitly necessary.
 *
 */
public class CarTransport extends Truck implements Platform {

    private ArrayList<Car> Cargo = new ArrayList<>(getLength()-1);


    /**
     * Creates instance of CarTransport using attributes inherited from Truck.
     */
    public CarTransport(){
        super(2, 100, 0, 4, "Flatbed");
    }


    /**
     * Will increase the angle of the platform
     */
    @Override
    public void RaisePlatform() {
        platformAngle = 70;
    }


    /**
     * Will decrease the angle of the platform
     */
    @Override
    public void LowerPlatform() {
        platformAngle = 0;
    }


    /**
     * Inserts an object of type car into the Cargo list
     * @param content the car to be loaded onto the transport
     */
    public void LoadCar (Car content){
        if (checkLoadAvailability(content)) {
            content.setIsloadedtrue();
            Cargo.add(content);}
    }


    /**
     * Checks if the car to be loaded is close enough to the car transport
     * @param car the object to compare the distance to
     * @return possibility to load the car
     */
    public boolean checkLoadAvailability(Car car) {
        if ((getLength()-1) > Cargo.size() && !car.getisloaded()) {

            if (platformAngle == 70){

                if (getDistanceBetweenPoints(car.getCoordinates(), getCoordinates()) <= 2) {
                return true;
            }
        } }
        return false;
    }


    /**
     * Removes the car from the cargo list and places it where it was left.
     */
    public void unloadCar() {
        if (platformAngle == 70) {
            Car Car = Cargo.remove(0);
            Car.setPositionX(getPositionX() + 1);
            Car.setIsloadedfalse();
        }
    }


    /**
     * Changes the position of all cars currently loaded onto the transport
     */
    @Override
    public void moveCall() {
        for (int i = 0; i < getLength(); i++) {
            System.out.println(i);
            Cargo.get(i).setPositionX(getPositionX()); // Ändra x positionen av cargo[i] till getPostionX
            Cargo.get(i).setPositionY(getPositionY()); // Ändra y positionen av cargo[i] till getPostionY

        }
        move();
    }
}
