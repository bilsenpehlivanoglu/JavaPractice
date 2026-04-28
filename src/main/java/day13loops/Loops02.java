package day13loops;

public class Loops02 {
    public static void main(String[] args) {

        //21 den 180 e kadar hem 2 ile hemde 3 ile bolunebilen tamsayilari yazdirin
        for (int i = 21; i<181; i++){
            if (i%2==0 && i%3==0){
                System.out.println(i);
            }
        }
    }
}
