package JavaPractice;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.AbstractCollection;
public class Assesment {


    public static int half (int n) {
        return n / 2;
    };

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }

    public static void main(String[] args) {
        System.out.println(half(12));
        System.out.println(shout("jeffrey"));



    }


public static void removeCats () throws IOException {
    String[] cats = {"brown", "wolfs", "dogs", "felius"};
    List<String> Al = Arrays.asList(cats);

    for(String cat : Al) {
        if (cat.equals("felius")) {
            Al.remove(cat);

        }
    }
    System.out.println(Al);

}

}
