package day07stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {

        //example 1:bir stringin bas ve sonunda space karakteri varsa siliniz.
        //If a string contains a space at the beginning or end, delete them.
        //" Ali Can " ==>Ali Can
        String s = "  Ali Can  ";
        System.out.println(s);
        //trim methodu bastaki ve sondaki bosluklari siler
        String sTrimmed = s.trim();
        System.out.println("sTrimmed = " + sTrimmed);

        //example 2:urunlerin fiyatlarini toplayiniz.
        //Sum the prices of the products.
        String tv = "$456.99";
        String laptop = "$875.99";

        String tv2 = tv.replace("$","");
        System.out.println("tv2 = " + tv2);
        String laptop2 = laptop.replace("$","");
        System.out.println(laptop2);

        Double sum =Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(sum);

    }
}
