package day13loops;

public class Loops02 {
    public static void main(String[] args) {

        //21 den 180 e kadar hem 2 ile hemde 3 ile bolunebilen tamsayilari yazdirin
        for (int i = 21; i<181; i++){
            if (i%2==0 && i%3==0){
                System.out.print(i+ " ");
            }
        }

        //size verilen kucuk harfle yazilmis string in indexi cift sayi olan karakterlerini buyk harfe donusturen kodu yaziniz
        //ankara==>AKR
        String s = "Ankara";
        for (int i = 0 ; i<s.length() ; i++){

            String ch = s.substring(i, i+1);
            System.out.println(ch);
            if (i%2==0){
                System.out.println(ch.toUpperCase());
            }
        }

        //verilen bir string de ilk a harfinnden onceki tum karakterleri yazdirin
        //I live Java==>I love J
        String s1 = "I live Java";
        for (int i = 0 ; i<s1.length() ; i++){
            if (s1.charAt(i)=='a'){
                break;
            }
            System.out.print(s1.charAt(i));
        }
    }
}
