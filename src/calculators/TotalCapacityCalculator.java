package calculators;

import plane.PassengerPlane;

public class TotalCapacityCalculator {
    public static int capacityCalculate (PassengerPlane ... args){
        int totalCapacity = 0;
        for (PassengerPlane i : args) {
             totalCapacity = totalCapacity + i.getCapacity();
        }
       return totalCapacity;
    }
}
