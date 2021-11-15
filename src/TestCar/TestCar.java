package TestCar;

import Labb1.Car;
import Labb1.Saab95;
import Labb1.Volvo240;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.awt.*;

public class TestCar {
    private Volvo240 volvo;
    private Saab95 saab;

    @BeforeEach
    void init(){
        volvo = new Volvo240();
        saab = new Saab95();
    }

    @Test
    public void test_getColor() {
        assertEquals(Color.black, volvo.getColor());
    }

    @Test
    public void test_getNrDoors(){
        assertEquals(2,saab.getNrDoors());
    }

    @Test
    public void test_getCurrentSpeed() {
        assertEquals(1, volvo.getCurrentSpeed());
    }

    @Test
    public void test_getEnginePower() {
        assertEquals(100, volvo.getEnginePower());
    }

    @Test
    public void test_setColor() {
        volvo.setColor(Color.CYAN);
        assertEquals(volvo.getColor(), Color.CYAN);
    }

    @Test
    public void test_startEngine(){
        volvo.startEngine();
        assertEquals(0.1, volvo.getCurrentSpeed());
    }

    @Test
    public void test_stopEngine(){
        volvo.startEngine();
        volvo.stopEngine();
        assertEquals(0, volvo.getCurrentSpeed());
    }

    @Test
    public void test_increaseSpeed() {
        double prev_speed = volvo.getCurrentSpeed();
        volvo.increaseSpeed(0.1);
        assertEquals(prev_speed + volvo.getSpeedFactor() * 0.1, volvo.getCurrentSpeed());
    }
    
//   @Test
//   public void test_decreaseSpeed(){
//       double prev_speed = volvo.getCurrentSpeed();
//       volvo.decreaseSpeed(0.1);
//       assertEquals(prev_speed - volvo.getSpeedFactor()*0.1, volvo.getCurrentSpeed());
//   }

    @Test
    public void test_gas(){

    }








}


