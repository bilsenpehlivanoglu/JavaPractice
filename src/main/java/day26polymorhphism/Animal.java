package day26polymorhphism;

public class Animal {

    //parenttaki override edilmis eat methoduna
    // "Overridden" method denir
    //parent classtaki bir methodun ozellestirerek
    // child class da kullanmaya overriding denir

    //Overriding de methodun parantezine ve method ismi degistirilmez, methodun body si degistirilir.
    public void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }

    public Animal create(){
        return new Animal();
    }



}
