package Plane;

public abstract class Plane  {

    private int fuel;
    private int range;
    private String name;

    public Plane (int fuel, int range, String name){
        this.fuel = fuel;
        this.range = range;
        this.name = name;
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
    @Override
    public String toString (){
        return this.range + " km";}
}
