package Labb1;

import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.List;

public class Workshop<T extends Vehicle> {
    private int maxCapacity;
    private List<T> content;
    private String workshopName;


    public Workshop(int maxCapacity, String workshopName) {
        this.maxCapacity = maxCapacity;
        this.workshopName = workshopName;
        this.content = new ArrayList<>(maxCapacity);

    }

    public int getContent_Size(){return content.size();}

    public List<T> getContent (){return content;}


    public void LoadVehicle(T vehicle) {content.add(vehicle);}


    public T removeVehicle(){
        T vehicle = content.remove(0);
        return vehicle;
    }





}
