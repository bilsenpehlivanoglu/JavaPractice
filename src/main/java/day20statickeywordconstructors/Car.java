package day20statickeywordconstructors;

public class Car {

    /*
    Constructor nedir?
    Class tan object uretmemize yarayan code blocklaridir.

    Class olusturdugumuzda java bize otomatik olarak bir Constructor verir.Ama bu Constructor gozle gorulmez.
    Gorunmeyen otomatik olarak java tarafindan verilen bu Constructor lara default Constructor denir

    default  Constructor ==> Car(){  }

    interview sorusu:method ile constructor arasindaki fark nedir?
    a)method larda return type olur, constructorlarda olmaz
    b)methodlar yaptiklari ise gore isimlendirilirler, constructorlar her zaman class ismi ile ayni olur.
    c)methodlar bir aksiyon icin olusturulur, constructorlar ise object olusturmak icindir.
    d)method isimleri kucuk harf ile baslar, constructorlar ise buyuk harfle baslar.

    parametreli constructor lar olusturarak ayni class dan farkli ozelliklere sahip objeler olusturabiliriz.
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

    public Car(String make, int year) {//bu bir constructor
        this.make = make;
        this.year = year;
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
