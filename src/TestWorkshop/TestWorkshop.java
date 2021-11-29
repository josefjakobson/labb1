package TestWorkshop;

import Labb1.Car;
import Labb1.Workshop;
import Labb1.Volvo240;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWorkshop {


    @Test
    public void test_LoadVehicle_Length (){
        Car TestCar = new Volvo240();
        Car TestCar2 = new Volvo240();
        Workshop Test_Workshop = new Workshop<Car>(1,"Test_WorkshopName");
        Test_Workshop.LoadVehicle(TestCar);
        Test_Workshop.LoadVehicle(TestCar2);
        assertEquals(Test_Workshop.getContent_Size(),1);

    }

    @Test
    public void test_LoadVehicle_Content() {
        Car TestCar = new Volvo240();
        Workshop Test_Workshop = new Workshop<Car>(1,"Test_Workshop");
        Test_Workshop.LoadVehicle(TestCar);
        assertEquals((Test_Workshop.getContent().get(0)), TestCar);

    }

}
