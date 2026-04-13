package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {

        //example 1:Bir stringin hic karakter icermedigini kontrol eden kodu yaziniz.
        //Check if this string contains any characters.
        String str = "";
        boolean result1 = str.length()==0;
        System.out.println("Is string empty = " + result1);

        //second way
        boolean result2 = str.isEmpty();
        System.out.println(result2);

        //example 2:stringin space haric hicbir karakter icermedigini kontrol edin.
        //Check if this string contains any characters except space.
        String t = "   ";
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println(result3);

    }
}
