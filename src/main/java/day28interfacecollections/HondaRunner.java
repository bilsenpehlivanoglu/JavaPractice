package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {

        Civic myCivic = new Civic();
        myCivic.cool();//Civic cool perf.

        Accord myAccord = new Accord();
        myAccord.cool();//Accord cool
        myAccord.run();//Accord runs super

    }
}
