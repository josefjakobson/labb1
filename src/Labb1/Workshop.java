package Labb1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Workshop {
    private int maxCapacity;
    private ArrayList<Vehicle> capacity;
    private String workshopName;
    private Vehicle specification;

    public Workshop(int maxCapacity, ArrayList capacity, String workshopName, Vehicle specification) {
        this.maxCapacity = maxCapacity;
        this.capacity = new ArrayList<>(maxCapacity);
        this.workshopName = workshopName;
        this.specification = specification;
    }

    public void LoadVehicle() {
        
    }


}
