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
        ArrayList<Vehicle> Vehicle = model.getVehicleArray();
        DrawPanel drawPanel = new DrawPanel(800, 560, Vehicle);
        CarView carView = new CarView("CarSim 1.0", drawPanel);


        model.addObserver(drawPanel);


        CarController cc = new CarController(Vehicle, carView);
        SaabController sc = new SaabController(Vehicle,carView);
        TruckController tc = new TruckController(Vehicle, carView);


        // Start a new view and send a reference of self


        // Start the timer
        model.start();

    }


}
