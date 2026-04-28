package day13loops;

public class Loops01 {
    public static void main(String[] args) {

        //example 1:ekrana 5 kere hi yazidirin.

        //dort tane loop vardir for-loop, while loop, do while loop, for each loop

        //a)for loop
     /*   for (baslangic degeri ; loop'un calisma sarti' ; i++){
            calisacak kodlar
        }
*/
        for (int i = 1 ; i<6 ; i++){
            System.out.println("Hi");
        }

        //11 den 14 e kadar tum  sayilari ekrana yazdiran kodu yaziniz.

        for (int i = 11 ; i<15 ; i++ ){
            System.out.println(i);
        }

        //example 3: 40 dan 23 e kadar tum cift syilari ekrana yazdiriniz
        for (int i = 40 ; i>22 ; i--){
            if (i%2==0){
                System.out.print(i+ " ");
            }
        }

        //example 4: 18 den 56vya kadar tum tek sayilari ekrana yazdirin
        for (int i = 18; i<56; i++){
            if (i%2!=0){
                System.out.print( i+ " ");
            }
        }
    }
}
