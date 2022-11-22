package grades;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {

        Student jeff = new Student("Jeffrey",new ArrayList<>());

        jeff.addGrade(100);
        jeff.addGrade(80);
        jeff.addGrade(60);
        jeff.addGrade(60);

        System.out.println(jeff.getGradeAverage());

    }

}
