package day12nestedternaryswitchloops;

public class NestedTernary01 {
    public static void main(String[] args) {

        //Example 1: verilen yilin "Artik yil"(leap year) olup olmadigini kontrol eden kodu yaziniz
        //yil 100 e bolunurse 400 e de bolunmelidir  1600==>leap 1800==>leap degil
        //yil 100 e bolunmuyorsa 4 e de bolunmelidir  2004==>leap 2005==>leap degil

        int year =1600;

        String result = year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");
        System.out.println(result);//leap
    }

}
