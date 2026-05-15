package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {

        //note: pass by value variablelerin orjinal degerlerini korur
        int shirtPrice = 100;

        System.out.println(discount("student", shirtPrice));//90
        System.out.println(discount("veteran", shirtPrice));//80
        System.out.println(discount("senior", shirtPrice));//95


        System.out.println(shirtPrice);//100 bu orjinali oldugu icin fiyati 100
    }

    //discount methodunu olusturun
    public static int discount(String type, int price){
        switch (type){
            case "student":
                price = price-10;
                break;
            case "veteran":
                price = price-20;
                break;
            case "senior":
                price = price-5;
                break;
            default:
                price=price;
        }
        return price;
    }
}
