package day32Exceptions;

public class E01 {
    public static void main(String[] args) {

        String s = "Java";
        getNumberOfChars(s);//4

        String t = "";
        getNumberOfChars(t);//0

        //stringin degeri null oldugunda
        String u = null;
        getNumberOfChars(u);//NullPointerException

    }

    public static void getNumberOfChars(String s){
        try {
            int numOfCharsl = s.length();
            System.out.println(numOfCharsl);
        } catch (NullPointerException e) {
            System.out.println("null degeri icin bazi methodlar kullanilamaz");
        }

    }
}
