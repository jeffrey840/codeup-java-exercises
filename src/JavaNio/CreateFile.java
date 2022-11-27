package JavaNio;

import java.nio.file.*;
import java.nio.*;
public class CreateFile {

    public static void main(String[] args) {
        try {
            Path p = Paths.get("DataSet/poem.txt");
            if (Files.exists(p)) {
                System.out.println("File already exits");
            } else {
                Path donePath = Files.createFile(p);
                System.out.println("file is created" + donePath.toString());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}

//created file inside DataSet named poem.txt

