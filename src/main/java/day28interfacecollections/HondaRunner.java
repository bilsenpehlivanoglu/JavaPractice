package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {

        Civic myCivic = new Civic();
        myCivic.cool();//Civic cool perf.
        myCivic.eco();//Uses gas less

        Accord myAccord = new Accord();
        myAccord.cool();//Accord cool
        myAccord.run();//Accord runs super

        System.out.println("Ac Price " +Ac.price);//Ac Price 2000
        System.out.println("Engine price "+Engine.price);//Engine price 3000

        Engine.stop();//stops securely



    }
}
