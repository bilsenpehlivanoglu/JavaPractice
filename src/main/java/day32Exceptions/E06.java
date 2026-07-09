package day32Exceptions;

public class E06 {
    public static void main(String[] args) {

        int a = 12;
        int b = 6;
        int c[] = {3,6,9,12};
        getElementFromArray(c,a,b);


    }

    public static void getElementFromArray(int []c, int a, int b){

        try {
            int idx = a/b;
            int element = c[idx];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("cut the connection with the database");
        }
    }
}

