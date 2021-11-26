package Labb1;

import java.util.ArrayList;


public class Flatbed extends Truck implements Platform {

    private ArrayList<Car> Cargo = new ArrayList<>(getLength()-1);

    public Flatbed(){
        super(2, 100, 0, 4, "Flatbed");
    }

    @Override
    public void RaisePlatform() {
        platformAngle = 70;
    }

    @Override
    public void LowerPlatform() {
        platformAngle = 0;
    }

    public void LoadCar (Car content){
        if (checkLoadAvailability(content)) {
            Cargo.add(content);}
    }

    public boolean checkLoadAvailability(Car Car) {
        if (platformAngle == 70){
            if (getDistanceBetweenPoints(Car.getCoordinates(), getCoordinates()) <= 2) {
                return true;
            }
        }
        return false;
    }
    
    public void unloadCar() {
        if (platformAngle == 70) {
            Car Car = Cargo.remove(0);
            Car.setPositionX(getPositionX() + 1);
        }
    }

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
