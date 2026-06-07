package day26polymorhphism;

public class Animal {

    //parenttaki override edilmis eat methoduna
    // "Overridden" method denir
    //parent classtaki bir methodun ozellestirerek
    // child class da kullanmaya overriding denir

    //Overriding de methodun parantezine ve method ismi degistirilmez, methodun body si degistirilir.

    //Child class da override edilen methodun return type ile
    // parent teki methodun return type i arasinda IS A iliskisin varsa return type degistirilebilri.

    //final methodlar override edilemezler
    //final keywordunu variable, class ve methodarda kullanilabilir.

    //polymorphism= method overloading ve overriding demektir
    //polymorphism consist of method overloading and overriding demektir
    //polimorfizm, metot aşırı yüklemesi ve geçersiz kılmadan oluşur.

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

    final int age = 5;

    public final double circle(double r){
        return 3.14*r*r;
    }



}
