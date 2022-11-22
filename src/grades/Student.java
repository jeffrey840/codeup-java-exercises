package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;


    //    CONSTRUCTOR
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

//    METHOD
// returns the student's name
    public String getName() {
        return name;
    }

    //    METHOD
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    //    METHOD
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (Integer grade : grades) {
            sum = sum + grade;
        }
        return sum/grades.size();
    }
}

