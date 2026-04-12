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

        //example 3:verilen ismin ilk harfini ve soy isminin ilk harfini ekrana yazdirin
        //Print the first letter of the given first name and the first letter of the given last name to the screen.
        //  Ali Can  ==>AC
        String name = "  Ali Can  ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);//C

        System.out.println(""+first+last);//AC




    }
}
