package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {

double kup = getCube(5);
        System.out.println(kup);

        print("java is easy");

        //second way
        //main method icinde iken method kullanilacak olan variableleri olusturun.
        String str="I'm Test Engineer";
        //method osmi ve parametreleri yazariz.
        printConsole(str);

        //verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methdou olusturn
        int a=3;
        int b=5;
        carpmaYap(a,b);

        //verilen bir tamsayinin karesini hesaplayan methodu yaziniz.
        int sayi=5;
        karesiniAl(sayi);
    }

    private static void karesiniAl(int sayi) {
        System.out.println(sayi*sayi);

    }

    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    private static void printConsole(String str) {
        System.out.println(str);
    }


    //1: verilen bir ondalik sayinin kupunu hesaplayan bir method olsuturp kullanin
    //Create and use a method to calculate the cube of a given decimal number.
    static double getCube(double a){ //bunun access mod'i default
        return a*a*a;
    }
    //note:access mod.default yapmak isterseniz, access modifier yazmayin

    //2: girilen bir kelimeyi ekrana yazdiran bir method olusturup kullanin.
    //Create and use a method that prints a given word to the screen.

   public static void print(String str){
       System.out.println(str);
   }


   //eger method yeni bir data uretmiyorsa return type void olur.ve return yazilmaz
}
