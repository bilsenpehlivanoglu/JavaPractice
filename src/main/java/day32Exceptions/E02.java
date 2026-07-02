package day32Exceptions;

public class E02 {
    public static void main(String[] args) {

        //birbitine donusturulemeyeck data type larini donusturmek istersek ClassCastException hatasi verir.
        Object obj = 70;
        try {
            String str = (String) obj;//ClassCastException
            System.out.println(str);
        } catch (ClassCastException e) {
            System.err.println("Her data type i, her data type a ceviremezsin");//err error un kisaltilmisi demektir
        }
    }
}
