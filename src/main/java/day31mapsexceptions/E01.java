package day31mapsexceptions;

public class E01 {
    public static void main(String[] args) {

          /*
          Exception : It means an unexpected problem.beklenmeyen problem
          bir hatayla karsilasinca Log kayitlarina bakariz.When an error occurs, the Log are reviewed.

           */
        int a = 12;
        int b = 0;
        divide(a,b);

        divide2(a,b);
    }

    public static void divide2(int a, int b){
        System.out.println(a/b);
    }

    public static void divide(int a,int b){
        System.out.println(a / b);
    }
}
