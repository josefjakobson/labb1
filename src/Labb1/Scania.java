package Labb1;

import java.awt.*;

public class Scania extends Truck {

    public Scania() {
        super(2, 125, 0, 3, "Scania");
    }


    @Override
    public void RaisePlatform() {
        if (platformAngle < 70 && getisMoving() == false) {
            platformAngle += 5;
            if (platformAngle > 70) {
                platformAngle = 70;
            }
        }
    }

    @Override
    public void LowerPlatform() {
        if (platformAngle == 0 && getisMoving() == false) {
            platformAngle -= 5;
            if (platformAngle > 0) {
                platformAngle = 0;
            }

        }
    }
}

