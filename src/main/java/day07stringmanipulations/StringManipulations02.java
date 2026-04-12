package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

        /*
        example:
        asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz.
        1)en az 8 karakter olsun/It must be at least 8 characters long.
        2)space karakteri passworda olmasin//The password must not contain spaces.
        3)en az bir buyuk harf olsun//at least one uppercase letter
        4)en az bir kucuk harf olsun//at least one lowercase letter
        5)en az bir rakam olsun//at least one number

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
        String pwd = input.nextLine();

        // 1)en az 8 karakter olsun
        boolean first = pwd.length()>7;
        System.out.println("first = "+first);

        //2)space karakteri passworda olmasin
        boolean second = !pwd.contains(" ");
        System.out.println("second = " + second);

        //3)en az bir buyuk harf olsun
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("third = " + third);

        //4)en az bir kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("fourth = " + fourth);

        //5)en az bir rakam olsun
        boolean fifth = pwd.replaceAll("[0-9]","").length()>0;
        System.out.println("fifth = " + fifth);

        System.out.println(("Is Password valid?  " + (first && second && third && fourth && fifth)));
    }
}
