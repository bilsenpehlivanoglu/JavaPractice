package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
        //object nasil olusturulur?
        //Constructor:Java da objectleri olusturmak icin kullanilan bir method dur.
        // class ismi + object ismi + assigment operator + "new" keyword + constructor
          Car myCar = new Car();//

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);


    }


}
