package day26polymorhphism;

public class Animal {

    //parenttaki override edilmis eat methoduna
    // "Overridden" method denir
    //parent classtaki bir methodun ozellestirerek
    // child class da kullanmaya overriding denir

    //Overriding de methodun parantezine ve method ismi degistirilmez, methodun body si degistirilir.

    //Child class da override edilen methodun return type ile
    // parent teki methodun return type i arasinda IS A iliskisin varsa return type degistirilebilri.
    public void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }

    public Animal create(){
        return new Animal();
    }

    public int add(int a, int b){
        return a+b;
    }

    public Integer multiply(Integer a, Integer b){
        return a*b;
    }

    final



}
