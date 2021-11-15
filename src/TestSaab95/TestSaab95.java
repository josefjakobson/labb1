package TestSaab95;
import java.awt.*;
import Labb1.Saab95;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSaab95 {

        @Test
        public void test_Speedf() {
            Saab95 Saab = new Saab95();
            Saab.setTurboOn();
            assertEquals(Saab.getSpeedFactor(), 1.625);
        }



    }
