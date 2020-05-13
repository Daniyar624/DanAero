package plane;

public class PassengerPlane extends Plane{
    private int capacity;

    public PassengerPlane(int fuel, int range, String name, int idNumber, int capacity) {
        super(fuel, range, name, idNumber);
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
}
