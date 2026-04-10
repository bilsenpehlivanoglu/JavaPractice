package day05concatinationoperatortypecasting;

public class Concatination {
    public static void main(String[] args) {

        //Bir string ve iki int variable olusturun.String degeri ile int lerin toplamini yazdirin.
        //Create a string and two integer variables. Print the sum of the string value and the integer values.
        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s+a+b);//elma1011
        System.out.println(s+(a+b));//elma21
        System.out.println(s+a*b);//elma110
        System.out.println(a+b+s);//21elma

        //String olarak verilen iki fiyatin toplamini yazdiriniz
        //Print the sum of two prices given as strings.
        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);//string degerler toplanmaz

        //Integer.valueOf():bu string degerleri integer a cevirir
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //String olarak verilen iki fiyatin toplamini yazdiriniz
        //Print the sum of two prices given as strings.
        String tv = "$1100";
        String radio = "$300";

        int sum = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(sum);



    }
}
