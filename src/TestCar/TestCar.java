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
    public void test_color() {
        assertEquals(Color.black, volvo.getColor());
    }

    @Test
    public void test_doors(){
        assertEquals(2,saab.getNrDoors());
    }

    @Test
    public void test_speed() {
        assertEquals(1, volvo.getCurrentSpeed());
    }

    @Test
    public void test_engine() {
        assertEquals(50, volvo.getEnginePower());
    }

    @Test
    public void test_setColor() {
        volvo.setColor(Color.CYAN);
        assertEquals(volvo.getColor(), Color.CYAN);
    }
}


