package Labb2;

import Labb1.*;
import org.testng.TestNGAntTask;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PrimitiveIterator;


/*
 * This class represents the Controller part in the MVC pattern.
 * It's responsibilities is to listen to the View and responds in a appropriate manner by
 * modifying the model state and the updating the view.
 */

public class CarController {
    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    int gasAmount = 0;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.

    // The frame that represents this instance View of the MVC pattern
    CarView frame;
    // A list of cars, modify if needed
    ArrayList<Vehicle> Vehicle;
    ModelAdapter model = new ModelAdapter();

    //methods:

    public CarController(ArrayList<Vehicle> Vehicle, CarView frame) {
        this.Vehicle = Vehicle;
        this.frame = frame;
        initComponents();
    }



    /* Each step the TimerListener moves all the cars in the list and tells the
     * view to update its images. Change this method to your needs.
     * */


    private void initComponents() {
        frame.gasSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                gasAmount = (int) ((JSpinner)e.getSource()).getValue();
            }
        });

        frame.gasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double gas = ((double) gasAmount) / 100;
                for (Vehicle car : Vehicle) {
                    car.gas(gas);
                    System.out.println(car.getCurrentSpeed());
                }
            }
        });

        frame.brakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double brake = ((double) gasAmount) / 100;
                for (Vehicle car : Vehicle) {
                    car.brake(brake);
                }
            }
        });

        frame.stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Vehicle car : Vehicle) {
                    car.stopEngine();
                }
            }
        });

        frame.startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Vehicle car : Vehicle) {
                    car.startEngine();
                    System.out.println(car.getCurrentSpeed());

                }
            }
        });



        frame.liftBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Vehicle car : Vehicle) {
                    if (car instanceof Truck) {
                        ((Truck) car).RaisePlatform();
                    }
                }
            }
        });

        frame.lowerBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Vehicle car : Vehicle) {
                    if (car instanceof Truck) {
                        ((Truck) car).LowerPlatform();
                    }
                }
            }
        });


    }


}
