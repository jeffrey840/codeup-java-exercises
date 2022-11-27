package OOP;
import java.nio.file.*;
import java.nio.*;
import java.util.Arrays;

public class FileNio {

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
}

//created a directory in codeup-java-exercise called dataset

