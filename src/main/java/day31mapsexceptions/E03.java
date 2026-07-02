package day31mapsexceptions;

public class E03 {
    public static void main(String[] args) {

        String s = "Java";
        getCharFromString(s,2);//v 2.indexte v harfi var

        String t = "Java";
        getCharFromString(t,4);

    }

    //stringlerde olmayan index kullanildiginda StringIndexOutOfBoundsException verir.
    public static void getCharFromString(String s,int idx){

        try {
            char ch =  s.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("index hatasi yaptiniz"+ e.getMessage());
            System.out.println(e.getCause());//null
            e.printStackTrace();

            System.out.println("kod calismaya devam etti");//kod calismaya devam etti
        }
    }
}
