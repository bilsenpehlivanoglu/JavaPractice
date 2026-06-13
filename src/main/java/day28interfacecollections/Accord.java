package day28interfacecollections;

public class Accord implements Ac,Engine,Security{

    @Override
    public void cool() {
        System.out.println("Accord cool");
    }
}
