package sorting;
import plane.Plane;

import java.util.ArrayList;
import java.util.List;

public class FuelFiltering {

    public static ArrayList<String> filtering (List<Plane> arr, int a, int b){
        ArrayList<String> planeName = new ArrayList<>();
        for (Plane plane : arr) {
            if (plane.getFuel() > a && plane.getFuel() < b)
                planeName.add(plane.getName());
        }
        return planeName; }
}

