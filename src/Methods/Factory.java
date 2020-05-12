package Methods;

import Plane.Plane;
import Plane.PassengerPlane;
import Plane.CargoPlane;

public class Factory {
    public static Plane create (String typeOfPlane) {
        switch (typeOfPlane){
            //PassengerPlanes
            case "Boeing777" : return new PassengerPlane(500, 2500, "Boeing777", 280);
            case "Boeing737" : return new PassengerPlane(400, 2200, "Boeing737", 250);
            case "AirbusA320" : return new PassengerPlane(800, 3300, "AirbusA320", 400);
            //CargoPlanes
            case "Ruslan" : return new CargoPlane(600, 2000, "Ruslan", 300);
            case "An124" : return new CargoPlane(550, 2600, "An124", 250);
            case "An22" : return new CargoPlane(650, 3200, "An22", 330);
            default: return null;
        }

    }


}
