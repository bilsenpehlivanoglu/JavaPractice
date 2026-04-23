package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {

        /*
        Kullanicidan 0'dan kucuk 120 den buyuk deger giremiyecek sekilde datalari aldiktan sonra

        Eger calisan kadin ise;
        60 yasindan buyukse "Emekli olabilir" yazdirin

        Eger calisan erkek ise;
        65 yasindan buyukse "Emekli olabilir" yazdirin


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender = input.next();

        System.out.println("Enter your age");
        int age = input.nextInt();

        if (age>0 || age<120){
            System.out.println("Enter your age between 0 and 120");
        }else if (gender.equalsIgnoreCase("Woman")){

            if (age>60){
                System.out.println("Can retire");
            }else {
                System.out.println("must work");
            }
        } else if (gender.equalsIgnoreCase("Man")) {

            if (age>65){
                System.out.println("can retire");
            }else {
                System.out.println("must work");
            }

        }else {
            System.out.println("Undefined");
        }

    }
}
