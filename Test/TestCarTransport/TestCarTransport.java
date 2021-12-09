package TestCarTransport;

import Labb1.*;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCarTransport {

    @Test
    public void test_raise_platform(){
        CarTransport CarTransport = new CarTransport();
        CarTransport.RaisePlatform();
        assertEquals(CarTransport.getPlatformAngle(), 70);
    }

    @Test
    public void test_get_length(){
        CarTransport CarTransport = new CarTransport();
        assertEquals(CarTransport.getLength(), 4);
    }
    @Test
    public void test_lower_platform(){
        CarTransport CarTransport = new CarTransport();
        CarTransport.LowerPlatform();
        assertEquals(CarTransport.getPlatformAngle(), 0);
    }

    @Test
    public void test_load_availability_if_angle_is_0(){
        CarTransport CarTransport = new CarTransport();
        Volvo240 volvo = new Volvo240();
        CarTransport.LowerPlatform();
        assertEquals(CarTransport.checkLoadAvailability(volvo), false);
    }

    @Test
    public void test_load_availability_if_angle_is_70_but_distance_too_great(){
        CarTransport CarTransport = new CarTransport();
        CarTransport.setPositionX(50);
        CarTransport.setPositionY(50);

        Volvo240 volvo = new Volvo240();
        volvo.setPositionX(10);
        volvo.setPositionY(10);

        CarTransport.RaisePlatform();
        assertEquals(CarTransport.checkLoadAvailability(volvo), false);
    }

    @Test
    public void test_load_availability_if_angle_is_70_and_within_distance(){
        CarTransport CarTransport = new CarTransport();
        CarTransport.setPositionX(50);
        CarTransport.setPositionY(50);

        Volvo240 volvo = new Volvo240();
        volvo.setPositionX(50);
        volvo.setPositionY(51);

        CarTransport.RaisePlatform();
        assertEquals(CarTransport.checkLoadAvailability(volvo), true);
    }

    @Test
    public void test_load_car(){
        CarTransport CarTransport = new CarTransport();
        CarTransport.setPositionX(50);
        CarTransport.setPositionY(50);

        Volvo240 volvo = new Volvo240();
        volvo.setPositionX(50);
        volvo.setPositionY(51);

        CarTransport.RaisePlatform();

        CarTransport.LoadCar(volvo);


        assertEquals((CarTransport.getCargo().get(0)), volvo);
    }

    @Test
    public void test_update_car_position_with_truck(){
        CarTransport CarTransport = new CarTransport();
        CarTransport.setPositionX(50);
        CarTransport.setPositionY(50);

        Saab95 saab = new Saab95();
        saab.setPositionX(51);
        saab.setPositionY(50);

        Volvo240 volvo = new Volvo240();
        volvo.setPositionX(50);
        volvo.setPositionY(51);


        CarTransport.RaisePlatform();
        CarTransport.LoadCar(volvo);
        CarTransport.LoadCar(saab);
        CarTransport.LowerPlatform();

        CarTransport.startEngine();
        for (int i = 0; i < 3; i++) {
            CarTransport.gas(1);
        }

        CarTransport.moveCall();

        assertEquals(volvo.getPositionY(), CarTransport.getPositionY());

    }

    @Test
    public void test_unload_with_platform(){
        CarTransport CarTransport = new CarTransport()  ;
        CarTransport.setPositionX(50);
        CarTransport.setPositionY(50);

        Volvo240 volvo= new Volvo240();
        volvo.setPositionX(50);
        volvo.setPositionY(51);

        Saab95 saab = new Saab95();
        saab.setPositionX(50);
        saab.setPositionY(51);


        CarTransport.RaisePlatform();

        CarTransport.LoadCar(volvo);
        CarTransport.LoadCar(saab);

        CarTransport.LowerPlatform();
        CarTransport.startEngine();
        for (int i = 0; i < 3; i++) {
            CarTransport.gas(1);
        }

        CarTransport.moveCall();
        CarTransport.RaisePlatform();

        CarTransport.unloadCar();

        assertEquals(volvo.getPositionY(),53.1);
    }
































}
