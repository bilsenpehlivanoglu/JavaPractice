package day15loops;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

        /*
        Gecerli Usename="admin" ve Password="pwd123" dur
        kullanicidan username ve password u alin
        username ve password dogru ise console "Hesabiniza hosgeldiniz" yazdrin
        username ve password 4 kere yanlis girilirse console "Hesabiniz bloke olmustur" yazdirin

         */
        Scanner input = new Scanner(System.in);

        int counter = 0;

        do {
            if (counter==4){
                System.out.println("Your account has been blocked.");
                break;
            }

            System.out.println("enter your username");
            String userName = input.next();

            System.out.println("enter your password");
            String password = input.next();

            if (userName.equals("admin") && password.equals("pwd123")){
                System.out.println("Welcome to your account!");
                break;
            }
            counter++;

        }while (true);
    }
}
