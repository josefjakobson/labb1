package TestScania;
import Labb1.Scania;
import Labb1.Truck;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertTrue;


public class TestScania {


    @Test
    public void test_isMoving() {
        Scania Scania = new Scania();
        assertEquals(Scania.getisMoving(), false);
    }

    @Test
    public void test_LowerPlatform_On() {
        Scania Scania = new Scania();
        Scania.gas(1);
        Scania.LowerPlatform();
        assertEquals(Scania.getPlatformAngle(),0);
    }

    @Test
    public void test_isMoving_gas() {
        Scania Scania = new Scania();
        Scania.gas(10);
        assertEquals(Scania.getisMoving(), true);
    }

    @Test
    public void test_RaisePlatform_TooHigh() {
        Scania Scania = new Scania();
        Scania.RaisePlatform();
        assertEquals(Scania.getPlatformAngle(),0);
    }

    @Test
    public void test_getIsMoving() {
        Scania Scania = new Scania();
        Scania.gas(1);

    }



}
