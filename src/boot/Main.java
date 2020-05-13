package boot;

import sorting.RangeComparator;
import calculators.TotalCapacityCalculator;
import plane.PlaneFactory;
import calculators.TotalCarryingCapacityCalculator;
import sorting.FuelFiltering;
import plane.CargoPlane;
import plane.PassengerPlane;
import plane.Plane;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Plane constructing...
        PassengerPlane boeing777 = (PassengerPlane) PlaneFactory.create("Boeing777");
        PassengerPlane boeing737 = (PassengerPlane) PlaneFactory.create("Boeing737");
        PassengerPlane airbusA320 = (PassengerPlane) PlaneFactory.create("AirbusA320");
        CargoPlane ruslan120 = (CargoPlane) PlaneFactory.create("Ruslan120");
        CargoPlane an124 = (CargoPlane) PlaneFactory.create("An124");
        CargoPlane an22 = (CargoPlane) PlaneFactory.create("An22");
        // Calculate total capacity...
        System.out.println("Total capacity: " + TotalCapacityCalculator.capacityCalculate(boeing737,boeing777,airbusA320) + " seats.");
        // Calculate total carrying capacity...
        System.out.println("Total carrying capacity: " + TotalCarryingCapacityCalculator.carryingCapacityCalculate(ruslan120,an124,an22) + " tons.");
        //Sorting planes by range of flight....
        List<Plane> plane = Arrays.asList(boeing737,boeing777,airbusA320,ruslan120,an124,an22);
        plane.sort(new RangeComparator());
        System.out.println("Sorting by range of flight: " + plane);
        //Searching for the plane by the given range of fuel consumption....
        System.out.println("Searching for the plane by the given range of fuel consumption...");
        System.out.println(FuelFiltering.filtering(plane, 700, 900));
    }
}
