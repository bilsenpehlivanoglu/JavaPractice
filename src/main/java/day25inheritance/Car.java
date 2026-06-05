package day25inheritance;

public class Car extends Vehicle{

    public Car(){
        System.out.println("Car 1");
    }
    public Car(String make){
        super(2000);
        System.out.println("Car 2");
    }
}
