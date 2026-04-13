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

        //second way
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println(result4);

        //third way
       boolean result5 = t.isBlank();
        System.out.println(result5);

        //isBlank :space haricindeki baska birsey olmadigini kontrol ediyor
        //isBlank"sadece space iceren stringler icin true verir.

        //example 3:Bir stringde a,i,e karakterleinin index toplamlarini ekrana yazdirin.
        //Print the sum of the indexes of the characters a, i, and e in a string.
        //Java esay to learn ==>
        String r = "Java esay to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);

    }
}
