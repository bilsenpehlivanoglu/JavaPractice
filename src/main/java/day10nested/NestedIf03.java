package day10nested;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {

        /*
        Password'un ilk harfi buyuk harf ise
        'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
        Adana==>gecerli

        Password'un ilk harfi kucuk harf ise
                'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                zehirli==> gecerli



         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
        String pwd = input.nextLine();

        if (pwd.charAt(0)>='A' && pwd.charAt(0)<='Z'){
            if (pwd.charAt(0)=='A'){
                System.out.println("valid password");
            }else {
                System.out.println("invalid password because the letter is not uppercase");
            }
        }else if (pwd.charAt(0)>='a' && pwd.charAt(0)<='z'){
            if (pwd.charAt(0)=='z'){
                System.out.println("valid password");
            }else {
                System.out.println("invalid password because the letter is not lowercase");
            }
        }else {
            System.out.println("The first character must be a letter.");
        }
    }
}
