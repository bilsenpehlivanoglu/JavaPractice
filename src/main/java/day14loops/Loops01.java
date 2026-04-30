package day14loops;

public class Loops01 {
    public static void main(String[] args) {

        //example 1: verilen bir string i ters ceviren kodu yaziniz.
        //Java ==>avaJ
        String t = "Java";
        String ters = "";

        //int i = t.length()-1 ; i>=0 ; i-- bu sekilde sondan baslar
        for (int i = t.length() - 1; i >= 0; i--) {
            ters = ters + t.substring(i, i + 1);
        }
        System.out.println(ters);//avaJ

        //second way
        String u = "Java";
        String ters2 = "";
        for (int i = u.length() - 1; i >= 0; i--) {
            ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters2);//avaJ

        //example 2:verilen bir stringin "Polindrome"
        // olup olmadigini kontrol eden kodu yaziniz.soldan saga ve sagdan sola okunmasi ayni olan demektir.
        //logic: stringi ters cevir sonrada ters hali ile duz halini karsilastir

        String duz = "ey edip adanada pide ye";
        String ters3 = "";
        for (int i = duz.length() - 1; i >= 0; i--) {
            ters3 = ters3 + duz.substring(i, i + 1);
        }
        if (duz.equals(ters3)) {
            System.out.println("It is a polindrome");
        } else {
            System.out.println("It is not Polindrome degildir");
        }


    }
}
