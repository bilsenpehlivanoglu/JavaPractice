package day07stringmanipulations;

public class Tekrar {
    public static void main(String[] args) {

        //example 1:bir stringin bas ve sonunda space karakteri varsa siliniz.
        //If a string contains a space at the beginning or end, delete them.
        //" Ali Can " ==>Ali Can
        String s = "  Ali Can  ";
        System.out.println(s);
        String s1 = s.trim();
        System.out.println(s1);

        //example 2:urunlerin fiyatlarini toplayiniz.
        //Sum the prices of the products.
        String tv = "$125.99";
        String laptop = "$250.99";

        String laptop1 = laptop.replace("$","");
        String tv1 = tv.replace("$","");

        Double sum = Double.valueOf(tv1)+Double.valueOf(laptop1);
        System.out.println(sum);

        //example 3:verilen ismin ilk harfini ve soy isminin ilk harfini ekrana yazdirin
        //Print the first letter of the given first name and the first letter of the given last name to the screen.
        //  Ali Can  ==>AC
        String s2 = "  Ali Can  ";
        char first = s2.trim().toUpperCase().charAt(0);

        char last = s2.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println("" +first + last);
    }
}
