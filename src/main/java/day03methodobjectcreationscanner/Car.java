package day03methodobjectcreationscanner;

public class Car {

    //Variable'lar olusturalim;passive
    public String model= "Tesla";
    public int fiyat=20000;

    //method olusturalim:active
    //note;return type void oldugunda method icinde "return" keyword kullanilmaz
    public void hareket(){
        System.out.println("Tesla is very fast");
    }
    public void dur(){
        System.out.println("Guvenli bir sekilde durur");
    }


}
