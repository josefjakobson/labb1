package Labb2;

import Labb1.Saab95;
import Labb1.Scania;
import Labb1.Vehicle;
import Labb1.Volvo240;

import javax.swing.*;
import java.util.ArrayList;

public class Application {



    public static void main(String[] args) {
        ModelAdapter model = new ModelAdapter();
        // Instance of this class
        ArrayList<Vehicle> Vehicle = new ArrayList<>();
        Vehicle.add(new Volvo240());
        Vehicle.add(new Scania());
        Vehicle.add(new Saab95());

        CarView carView = new CarView("CarSim 1.0");

        CarController cc = new CarController(Vehicle);
        SaabController sc = new SaabController(Vehicle);
        TruckController tc = new TruckController(Vehicle);


        // Start a new view and send a reference of self
        cc.frame = new CarView("CarSim 1.0");

        // Start the timer
        model.start();

    }


}
