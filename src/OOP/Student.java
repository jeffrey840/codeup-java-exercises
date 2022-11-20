package OOP;

public class Student {

//    //    two instance variables
//    public String name;
//    public String cohort;
//
////    constructor
//    public Student(String studentName) {
//        name = studentName;
//        cohort = "Unassigned";
//    }
//
// //    constructor
//    public Student(String studentName, String assignedCohort) {
//        name = studentName;
//        cohort = assignedCohort;
//    }
//
////    instance method getInfo()
//    public String getInfo() {
//        return String.format("name: %s, cohort: %s", name, cohort);
//    }
//
////    main method
//    public static void main(String[] args) {
//
////        made a new instance of student class
////        called constructor student and passed in student name and/or assigned cohort
//        Student s1 = new Student("Student A");
//        Student s2 = new Student("Student B", "Voyagers");
//
//        System.out.println(s1.getInfo()); // "name: Student A cohort: Unassigned"
//        System.out.println(s2.getInfo()); // "name: Student B cohort: Voyagers"
//    }

//============================================THIS KEYWORD EXAMPLE

        public String name;
        public String cohort;

        public Student(String name) {
            this(name, "Unassigned");
        }

        public Student(String name, String cohort) {
            this.name = name;
            this.cohort = cohort;
        }

        public String sayHello() {
            return "Hello from " + this.name + "!, im in the" + this.cohort;
        }

        public static void main(String[] args) {

//        made a new instance of student class
//        called constructor student and passed in student name and/or assigned cohort
        Student s1 = new Student("jeffrey");
        Student s2 = new Student("phillip", "Voyagers");

        System.out.println(s1.sayHello());
        System.out.println(s2.sayHello());
//            Hello from jeffrey!, im in theUnassigned
//            Hello from phillip!, im in theVoyagers

    }

}
