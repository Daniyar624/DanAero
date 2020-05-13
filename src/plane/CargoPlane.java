package plane;

public class CargoPlane extends Plane {
    private int carryingCapacity;

    public CargoPlane(int fuel, int range, String name,int idNumber ,int carryingCapacity) {
        super(fuel, range, name, idNumber);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity(){
        return carryingCapacity;
    }
    public void setCarryingCapacity(int carryingCapacity){
        this.carryingCapacity = carryingCapacity;
    }
}
