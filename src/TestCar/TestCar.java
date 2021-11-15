package TestCar;

import Labb1.Car;
import Labb1.Saab95;
import Labb1.Volvo240;
import org.testng.annotations.Test;
import org.junit.jupiter.api.BeforeEach;

import java.awt.*;

import static java.lang.Math.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestCar {

    @Test
    public void test_getColor() {
        Car volvo = new Volvo240();
        assertEquals(Color.black, volvo.getColor());}

    @Test
    public void test_getNrDoors(){
        Car saab = new Saab95();
        assertEquals(2,saab.getNrDoors());
    }

    @Test
    public void test_getCurrentSpeed() {
        Car volvo = new Volvo240();
        assertEquals(0, volvo.getCurrentSpeed());
    }

    @Test

    public void test_getEnginePower() {
        Car volvo = new Volvo240();
        assertEquals(100, volvo.getEnginePower());
    }

    @Test
    public void test_setColor() {
        Car volvo = new Volvo240();
        volvo.setColor(Color.CYAN);
        assertEquals(volvo.getColor(), Color.CYAN);
    }

    @Test
    public void test_startEngine(){
        Car volvo = new Volvo240();
        volvo.startEngine();
        assertEquals(0.1, volvo.getCurrentSpeed());
    }

    @Test
    public void test_stopEngine(){
        Car volvo = new Volvo240();
        volvo.startEngine();
        volvo.stopEngine();
        assertEquals(0, volvo.getCurrentSpeed());
    }


   @Test
   public void test_gas(){

       Car volvo = new Volvo240();

       double prev_speed = volvo.getCurrentSpeed();
       int amount = 1;
       volvo.gas(1.1);
       assertEquals(prev_speed + volvo.getSpeedFactor() * amount, volvo.getCurrentSpeed());
   }


    @Test
    public void test_brake(){                                      //The test checks the new value of current speed for the object.
        Car volvo = new Volvo240();
        volvo.brake(1.1);
        assertEquals(volvo.getCurrentSpeed(),0);
    }


    @Test
    public void test_move() {
        Car volvo = new Volvo240();
        volvo.gas(1);
        volvo.move();
        assertEquals(volvo.getCoordinates()[1], 1.25);
    }

    @Test
    public void test_right(){
        Car volvo = new Volvo240();
        volvo.turnRight();
        assertEquals(volvo.getDirection(),"Right");
    }

    @Test
    public void test_left(){
        Volvo240 volvo = new Volvo240();
        volvo.turnLeft();
        assertEquals(volvo.getDirection(),"Left");

    }

    @Test
    public void test_setTurboOn(){
        Saab95 saab = new Saab95();
        saab.setTurboOn();
        assertTrue(saab.getTurboOn());
    }

    @Test
    public void test_setTurboOff(){
        Saab95 saab = new Saab95();
        saab.setTurboOff();
        assertTrue(!saab.getTurboOn());

    }

}











