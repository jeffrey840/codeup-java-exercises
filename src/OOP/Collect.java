package OOP;
import java.util.Collections;
import java.util.ArrayList;



public class Collect {

    static ArrayList<Integer> numbers = new ArrayList<>();
    public static void main(String[] args) {
        numbers.add(20);    // adding an element
        numbers.add(0,21); // specifying an index
        numbers.add(22);

        System.out.println(numbers); // [21, 20, 22]

        System.out.println();

        System.out.println(numbers.size()); // 3
        System.out.println(numbers.get(2)); // 22

        System.out.println(numbers.indexOf(20));    // 1
        System.out.println(numbers.indexOf("cat")); // -1

    }

}


