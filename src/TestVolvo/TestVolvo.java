package TestVolvo;
import Labb1.Saab95;
import Labb1.Volvo240;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVolvo {
    @Test
    public void test_Speedf(){
        Volvo240 volvo = new Volvo240();
        assertEquals(volvo.getSpeedFactor(),1.25);
    }


}
