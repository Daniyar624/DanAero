package plane;

import plane.Plane;
import plane.PassengerPlane;
import plane.CargoPlane;

public class PlaneFactory {
    public static Plane create (String typeOfPlane) {
        switch (typeOfPlane){
            //PassengerPlanes
            case "Boeing777" : return new PassengerPlane(500, 2500, "Boeing777", 77701, 280);
            case "Boeing737" : return new PassengerPlane(400, 2200, "Boeing737", 73701, 250);
            case "AirbusA320" : return new PassengerPlane(800, 3300, "AirbusA320", 32002, 400);
            //CargoPlanes
            case "Ruslan120" : return new CargoPlane(600, 2000, "Ruslan120", 12001, 300);
            case "An124" : return new CargoPlane(550, 2600, "An124", 12401, 250);
            case "An22" : return new CargoPlane(650, 3200, "An22", 2205, 330);
            default: return null;
        }

    }


}
