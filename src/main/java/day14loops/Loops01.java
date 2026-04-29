package day14loops;

public class Loops01 {
    public static void main(String[] args) {

        //example 1: verilen bir string i ters ceviren kodu yaziniz.
        //Java ==>avaJ
        String t= "Java";
        String ters = "";

        //int i = t.length()-1 ; i>=0 ; i-- bu sekilde sondan baslar
        for (int i = t.length()-1 ; i>=0 ; i--){
            ters = ters + t.substring(i,i+1);
        }
        System.out.println(ters);//avaJ

    }
}
