package Labb2;

import Labb1.Saab95;
import Labb1.Scania;
import Labb1.Volvo240;

public class Application {

    public static void main(String[] args) {
        // Instance of this class
        CarController cc = new CarController();

        cc.Vehicle.add(new Volvo240());
        cc.Vehicle.add(new Scania());
        cc.Vehicle.add(new Saab95());

        // Start a new view and send a reference of self
        cc.frame = new CarView("CarSim 1.0", cc);

        // Start the timer
        //cc.timer.start();
    }
}
