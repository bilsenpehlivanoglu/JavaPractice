package day14loops;

public class Tekrar {
    public static void main(String[] args) {

        //example 1: verilen bir string i ters ceviren kodu yaziniz.
        //Java ==>avaJ
      /*  String s = "Java";
        String ters = "";

        for (int i = s.length()-1 ; i>=0 ; i--){
            ters = ters+s.charAt(i);
        }
        System.out.println(ters);*/

        //example 2:verilen bir stringin "Polindrome"
        // olup olmadigini kontrol eden kodu yaziniz.soldan saga ve sagdan sola okunmasi ayni olan demektir.
        //logic: stringi ters cevir sonrada ters hali ile duz halini karsilastir

        /*String a = "eyy edip adanada pide ye";
        String ters1 = "";

        for (int i = a.length()-1 ; i>=0 ; i--){
            ters1 = ters1+a.charAt(i);

        }
        if (a.equals(ters1)){
            System.out.println("it is a polindrome");
        }else {
            System.out.println("It is not a polindrome");
        }*/

        //example 1:5 den 8 e kadar tam sayilarinin toplamini veren kodu yaziniz
        //5+6+7+8==>26
        /*int sum = 0;

        for (int i =5; i<9; i++){
            sum = sum+i;//26
        }
        System.out.println(sum);*/

        //7 den 9 a kadar tam sayilarin carpimini veren kodu yaziniz
        //7*8*9==>504
       /* int multiply = 1;

        for (int i = 7; i<=9; i++){
            multiply = multiply*i;
        }
        System.out.println(multiply);//504*/


    }
}
