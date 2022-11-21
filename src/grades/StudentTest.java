package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student studentA = new Student("Jeffrey");

        studentA.addGrade(100);
        studentA.addGrade(40);
        studentA.addGrade(30);
        studentA.addGrade(30);

        System.out.println(studentA.getGradeAverage());

    }

}
