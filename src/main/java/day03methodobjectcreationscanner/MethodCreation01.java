package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {

double kup = getCube(5);
        System.out.println(kup);
    }

    //1: verilen bir ondalik sayinin kupunu hesaplayan bir method olsuturp kullanin
    //Create and use a method to calculate the cube of a given decimal number.
    static double getCube(double a){ //bunun access mod'i default
        return a*a*a;
    }
    //note:access mod.default yapmak isterseniz, access modifier yazmayin

}
