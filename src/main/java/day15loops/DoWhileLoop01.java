package day15loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        /*
        baslangic degeri

                do{
                calisacak kodlar
                artirma /azaltma

                }while(calisma kurali);
         */

        //example 1: 5 den 3 e kadar tam sayilari yazdirin

        int a =3;

        do {
            System.out.println(a);
            a--;
        }while (a>2);


    }
}
