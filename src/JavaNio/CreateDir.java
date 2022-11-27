package JavaNio;

import java.nio.file.*;
import java.nio.*;


public class CreateDir {
    public static void main(String[] args) {
        try {
            Path p= Paths.get("DataSet");
            if (Files.exists(p)) {
                System.out.println("Directory exits");
            } else {
                Path donePath =Files.createDirectories(p);
                System.out.println("Directory created at " + donePath.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//created a directory in Codeup-java-exercise called dataset

}

