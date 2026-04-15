package day08stringmanipulationmemoryusageifstatement;

public class Tekrar {
    public static void main(String[] args) {

        //Check if this string contains any characters.
        String s = "";
        boolean result = s.isEmpty();
        System.out.println(result);//true

        //Check if this string contains any characters except space.
        String s1 = "";
        boolean result1 = s1.isBlank();
        System.out.println(result1);//true

        //Print the sum of the indexes of the characters a, i, and e in a string.
        //Java is esay to learn ==>
        String s2 = "Java is esay to learn";
        int ida = s2.indexOf('a');
        int idi = s2.indexOf('i');
        int ide = s2.indexOf('e');
        System.out.println(ide + ida + idi);//14

        //Print the sum of the indexes of the characters j, y, and o in a string.
        //Java is esay to learn ==>

    }
}
