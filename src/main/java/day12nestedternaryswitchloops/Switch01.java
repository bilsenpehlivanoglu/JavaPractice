package day12nestedternaryswitchloops;

public class Switch01 {
    public static void main(String[] args) {

        //example 1: gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //Sunday==>1      Saturday==>7

        //if else cozumu
        String dayName = "Tuesday";

        if (dayName.equalsIgnoreCase("Sunday")){
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        }else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        }else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        }else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        }else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        }else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        }else {
            System.out.println("Enter a valid day name");
        }
    }
}
