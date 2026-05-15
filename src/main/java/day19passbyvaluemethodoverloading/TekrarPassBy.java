package day19passbyvaluemethodoverloading;

public class TekrarPassBy {
    public static void main(String[] args) {

        //note: pass by value variablelerin orjinal degerlerini korur

        int shirtPrice = 100;

        System.out.println(discount("student", shirtPrice));//95
        System.out.println(shirtPrice);//100
        System.out.println(discount("veteran", shirtPrice));//90
        System.out.println(discount("senior", shirtPrice));//85

        String name = "Tom Hanks";

        System.out.println(addTitle("Dr", name));//DrTom Hanks
        System.out.println(addTitle("Star ", name));//Star Tom Hanks


    }

    public static int discount(String type, int price){

        switch (type){
            case "student":
                price = price -5;
                break;
            case "veteran":
                price = price -10;
                break;
            case "senior":
                price = price - 15;
                break;
            default:
                price = price;

        }
        return price;
    }

    public static String addTitle(String title, String name){
        title = title + name;
        return title;
    }

}
