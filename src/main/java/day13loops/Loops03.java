package day13loops;

public class Loops03 {
    public static void main(String[] args) {

        //verilen  ir stringde kucuk harfleri console a yazmayiniz
        //"Pwd12?Ab" == P12?A output
        String s = "Pwd12?Ab";

        for (int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if (ch>='a' && ch<='z'){
                continue;
            }else {
                System.out.println(ch);
            }
        }
    }
}
