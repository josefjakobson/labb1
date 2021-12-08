package Labb2;

import Labb1.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.PrimitiveIterator;


/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController {
    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    CarView frame;
    // A list of cars, modify if needed
    ArrayList<Vehicle> Vehicle = new ArrayList<>();

    //methods:



    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle car : Vehicle) {
                car.move();
                int x = (int) Math.round(car.getPositionX());
                int y = (int) Math.round(car.getPositionY());
                frame.drawPanel.moveit(x, y);
                // repaint() calls the paintComponent method of the panel
                frame.drawPanel.repaint();
            }
        }
    }

    // Calls the gas method for each car once
    public void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle car : Vehicle) {
            car.gas(gas);
        }
    }

    public void brake(int amount) {
        double brake = ((double) amount) / 100;
        for (Vehicle car : Vehicle) {
            car.brake(brake);
        }
    }

    public void stopEngine() {
        for (Vehicle car : Vehicle) {
            car.stopEngine();
        }
    }

    public void startEngine() {
        for (Vehicle car : Vehicle) {
            car.startEngine();
        }
    }

    public void raisePlatform(){
        for (Vehicle car : Vehicle) {
            if (car instanceof Truck) {
                ((Truck) car).RaisePlatform();
            }
        }
    }

    public void lowerPlatform() {
        for (Vehicle car : Vehicle) {
            if (car instanceof Truck) {
                ((Truck) car).LowerPlatform();
            }
        }
    }

    public void turboOn() {

        for (Vehicle car : Vehicle) {
            if (car instanceof Saab95) {
                ((Saab95) car).setTurboOn();
            }
        }
    }
    public void turboOff() {

        for (Vehicle car : Vehicle) {
            if (car instanceof Saab95) {
                ((Saab95) car).setTurboOff();
            }
        }
    }
}
