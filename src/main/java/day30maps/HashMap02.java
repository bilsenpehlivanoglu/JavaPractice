package day30maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        HashMap<String,Integer> stdAges = new HashMap<>();
        stdAges.put("Gulce",30);
        stdAges.put("Abdullah",39);
        stdAges.put("Benna",32);
        stdAges.put("Hasan",30);


        //key i tekrarli kullanmdigimizda, en son yazdigimiz verilen entry nin degerini kabul eder
        stdAges.put("Abdullah",24);

        //siralama yaparken rastgele siralar bu yuzden hizlidir
        System.out.println(stdAges);//{Suleyman=33, Hasan=30, Abdullah=24, Gulce=30, Benna=32}

        //replace methodu key in value sini degistirmek icin bunu kullaniriz(deger degistirmek icin)
        stdAges.replace("Hasan",35);
        System.out.println(stdAges);//{Hasan=35, Abdullah=24, Gulce=30, Benna=32}




    }
}
