package Labb2;
import Labb1.*;
import org.testng.TestNGAntTask;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PrimitiveIterator;


public class SaabController {
    CarView frame;

    private ArrayList<Vehicle> Vehicle;

    public SaabController(ArrayList<Vehicle> Vehicle, CarView frame) {
        this.Vehicle = Vehicle;
        this.frame = frame;
        initComponents();
    }

    private void initComponents() {
        frame.turboOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Vehicle car : Vehicle) {
                    if (car instanceof Saab95) {
                        ((Saab95) car).setTurboOff();
                    }
                }
            }
        });

        frame.turboOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Vehicle car : Vehicle) {
                    if (car instanceof Saab95) {
                        ((Saab95) car).setTurboOn();
                        System.out.println("ON");
                    }
                }
            }
        });
    }
}


