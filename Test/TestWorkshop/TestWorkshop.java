package TestWorkshop;

import Labb1.*;

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
        assertEquals(Test_Workshop.getContent().size(),2);

    }

    @Test
    public void test_LoadCar_Content() {
        Car TestCar = new Volvo240();
        Workshop Test_Workshop = new Workshop<Car>(1,"Test_Workshop");
        Test_Workshop.LoadVehicle(TestCar);
        assertEquals((Test_Workshop.getContent().get(0)), TestCar);

    }

    @Test
    public void test_LoadVehicle_Content() {
        Car TestCar = new Volvo240();
        CarTransport Cartransport = new CarTransport();
        Scania scania = new Scania();

        Workshop Test_Workshop = new Workshop<Vehicle>(5,"Vehicle_workshop");
        Test_Workshop.LoadVehicle(TestCar);
        Test_Workshop.LoadVehicle(Cartransport);
        Test_Workshop.LoadVehicle(scania);
        assertEquals((Test_Workshop.getContent().get(2)), scania);

    }

    @Test
    public void test_UnLoadVehicle_Content() {
        Car TestCar = new Volvo240();
        Saab95 saab = new Saab95();

        Workshop Test_Workshop = new Workshop<Car>(5, "Vehicle_workshop");
        Test_Workshop.LoadVehicle(TestCar);
        Test_Workshop.LoadVehicle(saab);
        Test_Workshop.removeVehicle();

        assertEquals((Test_Workshop.getContent().get(0)), TestCar);

    }


}
