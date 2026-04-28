package day13loops;

public class Tekrar {
    public static void main(String[] args) {

        //example 1:ekrana 5 kere hi yazidirin.
        for (int i = 0; i<5 ; i++){
            System.out.println("Hi");
        }

        //11 den 14 e kadar tum  sayilari ekrana yazdiran kodu yaziniz.
        for (int i = 11; i<15 ; i++){
            System.out.println(i);
        }

        //example 3: 40 dan 23 e kadar tum cift syilari ekrana yazdiriniz
        for (int i = 40; i>23 ; i--){
            if (i%2==0){
                System.out.print(i+ " ");
            }
        }

        System.out.println("---------------------------------");

        //example 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdirin
        for (int i = 18; i<56 ; i++){
            if (i%2 != 0){
                System.out.print(i+ " ");
            }
        }
    }
}
