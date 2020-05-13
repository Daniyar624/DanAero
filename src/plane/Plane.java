package plane;
import java.util.Objects;

public abstract class Plane  {

    private int fuel;
    private int range;
    private String name;
    private int idNumber;

    public Plane(int fuel, int range, String name, int idNumber) {
        this.fuel = fuel;
        this.range = range;
        this.name = name;
        this.idNumber = idNumber;
    }
    //
    public int getFuel(){
        return fuel;
    }
    public void setFuel(int fuel){
        this.fuel = fuel;
    }
//
    public int getRange(){
        return range;
    }
    public void setRange(int range){
        this.range = range;
    }
//
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
//
    public int getIdNumber(){return idNumber;}
    public void setIdNumber(int idNumber){this.idNumber = idNumber;}
//


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return idNumber == plane.idNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber);
    }

    @Override
    public String toString (){
        return this.getName() + ": " + this.range + " km";}
}
