package day20statickeywordconstructors;

public class CarTekrar {

    String make = "Mercedes";
    String model = "MG";
    int year = 2026;
    boolean hybrid = true;

    public CarTekrar(String make, String model, int year, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public CarTekrar(String make,int year){
        this.make = make;
        this.year = year;
    }

    public CarTekrar(String model,boolean hybrid){
        this.model = model;
        this.hybrid = hybrid;
    }

    @Override
    public String toString() {
        return "CarTekrar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
