package day20statickeywordconstructors;

public class CarRunnerTekrar {
    public static void main(String[] args) {

        Car car1 = new Car("Honda","MG",2025,false);
        //Car{make='Honda', model='MG', year=2025, hybrid=false}
        Car car2 = new Car("Porsche",2026);
        //Car{make='Porsche', model='Accord', year=2026, hybrid=true}
        Car car3 = new Car("Audi","CA");
        //Car{make='Audi', model='CA', year=2023, hybrid=true}

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
