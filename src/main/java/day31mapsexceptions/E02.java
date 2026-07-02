package day31mapsexceptions;

public class E02 {
    public static void main(String[] args) {

        String s = "1234";
        convertStringToInt(s);

        String t = "123a";
        convertStringToInt(t);

    }

    //string i integer a cevirmek icin yazdik
    public static void convertStringToInt(String s){
        try {
            Integer intS = Integer.valueOf(s);
            System.out.println(intS + 1);//1235
        }catch (NumberFormatException e){
            System.out.println("Bir stringi sayiya donusturebilmesi icin rakam disi character olmamali");
            System.out.println(e.getMessage());
        }

    }
}
