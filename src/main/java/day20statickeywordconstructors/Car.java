package day20statickeywordconstructors;

public class Car {

    /*
    Constructor nedir?
    Class tan object uretmemize yarayan code blocklaridir.

    Class olusturdugumuzda java bize otomatik olarak bir Constructor verir.Ama bu Constructor gozle gorulmez.
    Gorunmeyen otomatik olarak java tarafindan verilen bu Constructor lara default Constructor denir

    default  Constructor ==> Car(){  }
     */


    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car (String make,String model,int year,boolean hybrid){
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public Car(String make,String model){
        this.make = make;
        this.model = model;
    }


    @Override//bu methodla runner classtaki herseyi console yazdirabilriz.
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
