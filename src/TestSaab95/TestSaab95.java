package TestSaab95;
import java.awt.*;
import Labb1.Saab95;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestSaab95 {

    @Test
    public void test_SpeedFactor() {
        Saab95 Saab = new Saab95();
        Saab.setTurboOn();
        assertEquals(Saab.getSpeedFactor(), 1.625);
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

    @Test
    public void test_getTurboOn(){
        Saab95 saab = new Saab95();
        assertTrue(!saab.getTurboOn());
    }
}
