package Labb1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Workshop<T extends Vehicle> {
    private int maxCapacity;
    private List<T> content;
    private String workshopName;
    private Vehicle specification;

    public Workshop(int maxCapacity, String workshopName) {
        this.maxCapacity = maxCapacity;
        this.workshopName = workshopName;
        this.content = new ArrayList<>(maxCapacity);

    }

    public void LoadVehicle(T vehicle) {
        content.add(vehicle);
    }

    public T removeVehicle(){
        T vehicle = content.remove(0);
        return vehicle;
    }





}
