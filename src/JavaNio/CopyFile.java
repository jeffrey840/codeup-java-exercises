package JavaNio;

import java.nio.file.*;
import java.util.*;

public class CopyFile {
//✅ copied file from src/JavaNio/TestFile.txt
//    and pasted the file to DataSet

    public static void main(String[] args) {
        try {

            System.out.println("Started:" + new Date());

            Path source = Paths.get("src/JavaNio/TestFile.txt");
            Path destination = Paths.get("DataSet/pasted.txt");
//       ✅ copy and moved file from src/JavaNio/TestFile.txt
//          Files.move(source, destination);
            Files.copy(source, destination);
            System.out.println("completed: " + new Date());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
