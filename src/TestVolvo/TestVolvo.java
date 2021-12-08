package TestVolvo;
import Labb1.Volvo240;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVolvo {
    @Test
    public void test_getSpeedFactor(){
        Volvo240 volvo = new Volvo240();
        assertEquals(volvo.getSpeedFactor(),1.25);
    }

    @Test
    public void test_gas_when_amount_less_than_zero() {
        Volvo240 volvo = new Volvo240();
        volvo.setPositionY(50);
        volvo.setPositionX(50);
        volvo.gas(-2);
        volvo.moveCall();

        assertEquals(volvo.getPositionY(), 50);
    }

    @Test
    public void test_when_amount_less_than_zero() {
        Volvo240 volvo = new Volvo240();
        volvo.setPositionY(50);
        volvo.setPositionX(50);
        volvo.gas(1);
        volvo.brake(-1);
        volvo.moveCall();

        assertEquals(volvo.getPositionY(), 51.25);
    }

    @Test
    public void donuts_in_the_parking_lot(){
        Volvo240 volvo = new Volvo240();
        volvo.setPositionY(50);
        volvo.setPositionX(50);
        for (int i = 0; i < 3; i++) {
            volvo.gas(1);
        }

        for (int i = 0; i < 4; i++) {
            volvo.turnRight();
            volvo.moveCall();
        }

        for (int i = 0; i < 5; i++) {
            volvo.turnLeft();
            volvo.moveCall();
        }

        assertEquals(volvo.getDirection(), "Left");
    }

    @Test
    public void test_stop_engine(){
        Volvo240 volvo = new Volvo240();
        volvo.setPositionY(50);
        volvo.setPositionX(50);

        volvo.startEngine();
        volvo.moveCall();

        volvo.stopEngine();

        assertEquals(volvo.getCurrentSpeed(), 0);

    }

}
