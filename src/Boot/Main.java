package Boot;

import Methods.CompByRange;
import Methods.TotalCapacityCalculator;
import Methods.Factory;
import Methods.TotalCarryingCapacityCalculator;
import Methods.FuelFiltering;
import Plane.CargoPlane;
import Plane.PassengerPlane;
import Plane.Plane;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Plane constructing...
        PassengerPlane Boeing777 = (PassengerPlane) Factory.create("Boeing777");
        PassengerPlane Boeing737 = (PassengerPlane) Factory.create("Boeing737");
        PassengerPlane AirbusA320 = (PassengerPlane) Factory.create("AirbusA320");
        CargoPlane Ruslan = (CargoPlane) Factory.create("Ruslan");
        CargoPlane An124 = (CargoPlane) Factory.create("An124");
        CargoPlane An22 = (CargoPlane) Factory.create("An22");
        // Calculate total capacity...
        TotalCapacityCalculator.CapacityCalculate(Boeing737,Boeing777,AirbusA320);
        // Calculate total carrying capacity...
        TotalCarryingCapacityCalculator.CarryingCapacityCalculate(Ruslan,An124,An22);
        //Sorting planes by range of flight....
        Plane[] plane = new Plane[6];
        plane[0] = Boeing737;
        plane[1] = Boeing777;
        plane[2] = AirbusA320;
        plane[3] = An124;
        plane[4] = Ruslan;
        plane[5] = An22;
        Arrays.sort(plane, new CompByRange());
        System.out.println("Sorting by range of flight: " + Arrays.toString(plane));
        //Searching for the plane by the given range of fuel consumption....
        FuelFiltering.Filtering(plane, 700, 900);
    }
}
