package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {

        //example: kullanicidan bir ulke ismi aliniz.Alinan ulke adina gore kisaltmalari yazdirinz
        Scanner input = new Scanner(System.in);
        System.out.println("enter a country name");
        String countryName = input.nextLine();

        switch (countryName.toLowerCase()){
            case "amerika":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("enter a valid country name");
        }
    }
}
