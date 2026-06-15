package day28interfacecollections;

public class Accord implements Ac,Engine,Security{

    @Override
    public void cool() {

        System.out.println("Accord cool");
    }

    @Override
    public void run() {
        System.out.println("Accord runs super");
    }

}
