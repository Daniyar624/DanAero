package Methods;
import Plane.Plane;

public class FuelFiltering {

    public static void Filtering (Plane[] arr, int a, int b){
        System.out.println("Searching for the plane by the given range of fuel consumption...");
        for (int i=0; i<arr.length; i++){
            if (arr[i].getFuel()>a && arr[i].getFuel()<b)
                System.out.println("The plane has been found: " + arr[i].getName() + ".");
        }
        }
}
