package calculators;
import plane.CargoPlane;

public class TotalCarryingCapacityCalculator {
    public static int carryingCapacityCalculate (CargoPlane ... args){
        int totalCarryingCapacity = 0;
        for (CargoPlane i : args){
            totalCarryingCapacity = totalCarryingCapacity + i.getCarryingCapacity();
        }
        return totalCarryingCapacity;
    }

}
