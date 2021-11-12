
import Labb1.Car;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.awt.*;

public class TestCar {


    @Test
    public void test_color() {
        Car Tesla = new Car(4, 50, 1, Color.red, "Tesla");
        assertEquals(Color.red,Tesla.getColor());
    }

    @Test
    public void test_doors(){
        Car Tesla = new Car(4, 50, 1, Color.red, "Tesla");
        assertEquals(4,Tesla.getNrDoors());
    }

    @Test
    public void test_speed() {
        Car Tesla = new Car(4, 50, 1, Color.red, "Tesla");
        assertEquals(1, Tesla.getCurrentSpeed());
    }

    @Test
    public void test_engine() {
        Car Tesla = new Car(4, 50, 1, Color.red, "Tesla");
        assertEquals(50, Tesla.getEnginePower());
    }

    @Test
    public void test_setColor() {
        Car Tesla = new Car(4, 50, 1, Color.red, "Tesla");
        Tesla.setColor(Color.CYAN);
        assertEquals(Tesla.getColor(), Color.CYAN);
    }
}


