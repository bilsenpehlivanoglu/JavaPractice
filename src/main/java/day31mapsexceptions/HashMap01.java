package day31mapsexceptions;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        //hashmap arkasinda calisan sistem nasildir?
        HashMap<String,String> capitals = new HashMap<>();
        capitals.put("USA","Washington");
        capitals.get("USA");
        capitals.put("Italy","Roma");
        capitals.put("USA","Bedford");
        System.out.println(capitals.hashCode());
    }
}
