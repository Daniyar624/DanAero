package Methods;
import Plane.CargoPlane;

public class TotalCarryingCapacityCalculator {
    public static void CarryingCapacityCalculate (CargoPlane ... args){
        int totalCarryingCapacity = 0;
        for (CargoPlane i : args){
            totalCarryingCapacity = totalCarryingCapacity + i.getCarryingCapacity();
        }
        System.out.println("Total carrying capacity: " + totalCarryingCapacity + " tons.");
    }

}
