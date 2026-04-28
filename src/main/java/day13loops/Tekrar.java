package day13loops;

public class Tekrar {
    public static void main(String[] args) {

        //example 1:ekrana 5 kere hi yazidirin.
        for (int i = 0; i<5 ; i++){
            System.out.println("Hi");
        }

        //11 den 14 e kadar tum  sayilari ekrana yazdiran kodu yaziniz.
        for (int i = 11; i<15 ; i++){
            System.out.println(i);
        }

        //example 3: 40 dan 23 e kadar tum cift syilari ekrana yazdiriniz
        for (int i = 40; i>23 ; i--){
            if (i%2==0){
                System.out.print(i+ " ");
            }
        }

        System.out.println("---------------------------------");

        //example 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdirin
        for (int i = 18; i<56 ; i++){
            if (i%2 != 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println("---------------------------------");

        //21 den 180 e kadar hem 2 ile hemde 3 ile bolunebilen tamsayilari yazdirin
        for (int i = 21; i<180; i++ ){
            if (i%2==0 && i%3==0){
                System.out.print(i+ " ");
            }
        }

        System.out.println("---------------------------------");

        //size verilen kucuk harfle yazilmis string in indexi
        // cift sayi olan karakterlerini buyk harfe donusturen kodu yaziniz
        //ankara==>AKR
        String s = "Ankara";
        for (int i = 0; i<s.length(); i++){
            String ch = s.substring(i,i+1);
            if (i%2==0){
                System.out.println(ch.toUpperCase());
            }
        }

        System.out.println("---------------------------------");

        //verilen bir string de ilk a harfinnden onceki tum karakterleri yazdirin
        //I live Java==>I love J
        String s1 = "I live Java";
        for (int i = 0; i<s1.length(); i++){
            char ch1 = s1.charAt(i);
           if (ch1=='a'){
               break;
           }
            System.out.print(s1.charAt(i));

        }

        System.out.println("---------------------------------");

        //verilen bir stringde son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //Germany ==> yn
        String s3 = "Germany";
        for (int i = s3.length()-1; i>=0; i--){
           if (s3.charAt(i)=='a'){
               break;
           }
            System.out.print(s3.charAt(i));

        }

        System.out.println("---------------------------------");

        //verilen  ir stringde kucuk harfleri console a yazmayiniz
        //"Pwd12?Ab" == P12?A output
        String s4 = "Pwd12?Ab";
        for (int i = 0; i<s4.length(); i++){
            char ch = s4.charAt(i);
            if (ch>='a' && ch<='z'){
                continue;
            }else {
                System.out.print(ch);
            }
        }
    }
}
