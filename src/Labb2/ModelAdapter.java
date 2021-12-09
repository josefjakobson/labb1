package Labb2;

import Labb1.Saab95;
import Labb1.Scania;
import Labb1.Vehicle;
import Labb1.Volvo240;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ModelAdapter {


    ArrayList<Vehicle> vehicle;

    public ArrayList<Vehicle> getVehicleArray(){
        vehicle = new ArrayList<>();
        vehicle.add(new Volvo240());
        vehicle.add(new Scania());
        vehicle.add(new Saab95());

        return vehicle;
    }
    private final int delay = 50;

    private Timer timer = new Timer(delay, new TimerListener());

    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle car : vehicle) {
                car.move();
                int x = (int) Math.round(car.getPositionX());
                int y = (int) Math.round(car.getPositionY());
                if (x > 700 || y > 700 || x < 0 || y < 0) {
                    car.turnRight();
                    car.turnRight();
                }

                // repaint() calls the paintComponent method of the panel
                //frame.drawPanel.repaint();
            }
        }
    }

    public void start(){
        timer.start();
    }
}
