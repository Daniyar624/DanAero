package Methods;

import Plane.PassengerPlane;

public class TotalCapacityCalculator {
    public static void CapacityCalculate (PassengerPlane ... args){
        int totalCapacity = 0;
        for (PassengerPlane i : args) {
             totalCapacity = totalCapacity + i.getCapacity();
        }
        System.out.println("Total capacity: " + totalCapacity + " seats.");
    }
}
