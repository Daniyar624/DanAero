package Plane;

public class CargoPlane extends Plane {
    private int carryingCapacity;

    public CargoPlane(int fuel, int range, String name, int carryingCapacity) {
        super(fuel, range, name);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity(){
        return carryingCapacity;
    }
    public void setCarryingCapacity(int carryingCapacity){
        this.carryingCapacity = carryingCapacity;
    }
}
