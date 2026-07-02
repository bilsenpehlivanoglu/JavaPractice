package day31mapsexceptions;

public class E04 {
    public static void main(String[] args) {

        String arr[] = {"J","A","V","A"};
        getElementFromArray(arr,1);

    }
    public static void getElementFromArray(String [] s, int idx){
        String el = s[idx];
        System.out.println(el);
    }
}
