package Labb1;

import java.awt.*;
/**
 * @JosefJakobson
 * @JonathanSvantesson
 * @JonathanEdenlund
 * A subclass of Truck that contains all necessary methods and attributes that all Scania objects should have.
 *
 * To access attributes, external methods will have to use getters and setters. This is to protect variables from being
 * changed or accessed unless explicitly necessary.
 *
 */
public class Scania extends Truck {

    /**
     * Creates instance of Scania using attributes inherited from Truck.
     */
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

