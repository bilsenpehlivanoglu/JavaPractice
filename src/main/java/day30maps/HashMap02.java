package day30maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        HashMap<String,Integer> stdAges = new HashMap<>();
        stdAges.put("Gulce",30);
        stdAges.put("Abdullah",39);
        stdAges.put("Benna",32);
        stdAges.put("Hasan",30);
        stdAges.put("Suleyman",33);
        stdAges.put("Abdullah",24);

        System.out.println(stdAges);//{Suleyman=33, Hasan=30, Abdullah=39, Gulce=30, Benna=32}

    }
}
