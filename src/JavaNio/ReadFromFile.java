package JavaNio;

import java.nio.file.*;
import java.util.*;

public class ReadFromFile {

    public static void main(String[] args) {
        try {
            Path p = Paths.get("DataSet/poem.txt");

            List<String> data = Files.readAllLines(p);

            for (String s : data) {
                System.out.println(s);

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
