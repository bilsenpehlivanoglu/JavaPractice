package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Java bu satiri okumaz, it is a comment line.

        /*
        It is also comment line.
         */

        //Variable is a passive features
        //How can I create a variable?
        //Data type + varieble name + Assigment operator + variable value + noktali virgul

        int age = 13;

        /*
       1) primitive data type:
        char,boolean,byte,short,int ,long,float,double

       2) non-primitive:
        String
         */
        String studentName= "Ali Can";

        char firstLetter = 'A';

        boolean isRetired = false;

        byte studentAge = 14;

        short populationOfSite = 1300;

        int populationOfCountry = 130000;

        long cellNumber = 1234567L;

        float priceOfTshirt = 16.25F;

        double weightCell = 0.0013;
        double weightAmip = 0.00003;

        //Create two variables for students' grades and print their totals to the screen.
        byte note1 = 50;
        byte note2 = 70;

        System.out.println(note1+note2);

    }
}
