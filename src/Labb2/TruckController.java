package Labb2;

import Labb1.Truck;
import Labb1.Vehicle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TruckController {
    CarView frame;
    ArrayList<Vehicle> Vehicle;

    public TruckController(ArrayList<Vehicle> Vehicle) {
        this.Vehicle = Vehicle;

    }
    private void initComponents() {


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
    }
}
