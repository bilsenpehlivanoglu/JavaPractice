package day25inheritance;

public class Honda extends Car{

    public Honda(){
        super("Accord");
        System.out.println("Honda 1");
    }

    public Honda(String model, int year){
        super();//super i
        System.out.println("Honda 2");
    }
}
