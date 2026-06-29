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

        //eski degeri kontrol ederek yeni degeri degistirir.
        stdAges.replace("Gulce",30,35);

        //putIfAbsent eger key olarak yoksa ekleme yapar, varsa ekleme yapmaz
        stdAges.putIfAbsent("Suleyman",44);
        System.out.println(stdAges);//{Suleyman=44, Hasan=35, Abdullah=24, Gulce=35, Benna=32} olmadigi icin ekledi

        stdAges.putIfAbsent("Ali",18);
        System.out.println(stdAges);//{Suleyman=44, Hasan=35, Abdullah=24, Gulce=35, Benna=32, Ali=18}

        //get ve getordefault eger aranan eleman varsa ayni value verir, yoksa null verir
        System.out.println(stdAges.get("Abdullah"));//24
        System.out.println(stdAges.getOrDefault("Abdullah", 0));//24

        //containsValue methodu map in icindeki value larin icerisinde olup olmadigini kontrol eder
        System.out.println(stdAges.containsValue(63));//false

        System.out.println(stdAges.containsKey("Seda"));//false, eleman olmadigi icin
        System.out.println(stdAges.containsKey("Hasan"));//true, eleman oldugu icin

        //remove methodu key kullanarak entry i siler
        stdAges.remove("Abdullah");
        System.out.println(stdAges);//{Suleyman=44, Hasan=35, Gulce=35, Benna=32, Ali=18}

        stdAges.remove("Ali",18);
        System.out.println(stdAges);//{Suleyman=44, Hasan=35, Gulce=35, Benna=32}





    }
}
