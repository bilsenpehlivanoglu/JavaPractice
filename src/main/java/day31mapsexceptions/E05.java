package day31mapsexceptions;

public class E05 {
    public static void main(String[] args) {

        int a = 12;
        int b = 4;
        String s = "Java";
        getcharFromString(s,a,b);//a

    }

    public static void getcharFromString(String s, int a, int b){
        try {
            int idx = a/b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("Do not divide by zero");
        }
    }
}
