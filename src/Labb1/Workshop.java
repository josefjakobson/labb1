package Labb1;
/**
 * @JosefJakobson
 * @JonathanSvantesson
 * @JonathanEdenlund
 *
 * A class that creates instance objects of a Workshop with all the necessary attributes and methods for
 * a workshop. Type T extends from the superclass Vehicle.
 *
 * To get access to attributes getters and setters are used.
 */

import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.List;

public class Workshop<T extends Vehicle> {
    private int maxCapacity;
    private List<T> content;
    private String workshopName;

    /**
     * A constructor for creating instance object for the class Workshop. Contains all the attributes
     * for the class.
     *
     * @param maxCapacity are the max number of vehicles in the workshop
     * @param workshopName the name of the specific workshop (instance object)
     */
    public Workshop(int maxCapacity, String workshopName) {
        this.maxCapacity = maxCapacity;
        this.workshopName = workshopName;
        this.content = new ArrayList<>(maxCapacity);

    }

    /**
     * Gets the value of the attribute content
     * @return the value of the attribute content
     */
    public List<T> getContent (){return content;}

    /**
     * Loads the specific Vehicle in to the workshop (the attribute content).
     * @param vehicle the type of the instance object
     */
    public void LoadVehicle(T vehicle) {content.add(vehicle);}

    /**
     * Removes the vehicle from the workshop (removes the instance object from the arraylist)
     * @return the instance object
     */
    public T removeVehicle(){
        T vehicle = content.remove(content.size() - 1);
        return vehicle;
    }

}
