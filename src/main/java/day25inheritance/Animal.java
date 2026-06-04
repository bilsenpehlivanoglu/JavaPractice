package day25inheritance;


public class Animal {

    //Inheritance:miras alma
    /*
      ozellikleri bir classstan diger classlara alan bir kavramdir.

      Inheritance in faydalari:
      1)code tekrarlarindan kurtuluruz
      2)code tamiri (maintenance) kolay olur
      3)child class lari daha atomik yapmis oluruz

      ==>bir class i baska bir class in child classi yapmak icin extends keyword kullanilir
      ilk yazilan child, ikinci yazilan parent olur, parent a super class da denir

      ==>child class objeleri parant class tan method ve variable kullanabilirler
      ==>parent class objectleri child class dan method ve variable kullanamazlar

      ==>Java da bir class in sadece bir tane parenti olabilir, coklu parent e "multiple inheritance" derler
      tekli parent a "single inheritance" derler.
      Java "multiple inheritance" desteklemez
      Java "single inheritance" kullanir

     */

    public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }






}
