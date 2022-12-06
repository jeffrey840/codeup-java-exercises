package JavaPractice;

import java.io.IOException;
import java.util.ArrayList;
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

public static ArrayList<Animal> removeCats(ArrayList<Animal> cats)  {

    for(Animal cat : cats) {
        if (cat.getSpecies().equals("Felis catus")) {
            cats.remove(cat);
        }

    }return cats;
}
}
