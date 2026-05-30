package day23datetimevarargs;

public class Varargs02 {
    public static void main(String[] args) {

        //example: verilen isimlerin ilk harflerini console yazdiran method u olusturunuz.
        //        Ali Can ==>AC    Kemal Han ==>KH


    }

    public static void getInitials(String... s){
        String initials = "";
        for (String w : s){
            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials="";
        }
    }
}
