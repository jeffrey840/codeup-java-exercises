package grades;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

//  MAIN METHOD
    public static void main(String[] args) {

//      NEW INSTANCE
        Student Joe = new Student("Joe", new ArrayList<>());
        Joe.addGrade(90);
        Joe.addGrade(60);
        Joe.addGrade(90);

//      NEW INSTANCE
        Student Nick = new Student("Nick", new ArrayList<>());
        Nick.addGrade(90);
        Nick.addGrade(60);
        Nick.addGrade(60);

//      NEW INSTANCE
        Student Luis = new Student("Luis", new ArrayList<>());
        Luis.addGrade(80);
        Luis.addGrade(90);
        Luis.addGrade(60);

//      NEW INSTANCE
        Student Terry = new Student("Terry", new ArrayList<>());
        Terry.addGrade(80);
        Terry.addGrade(90);
        Terry.addGrade(60);


//      MAKING A NEW HASHMAP
        HashMap<String, Student> students = new HashMap<>();

//      INSERTING ELEMENTS(KEY/VALUE PAIRS)
//      KEY = USERNAME / VALUE = NAME
        students.put("Joe11", Joe);
        students.put("Nick99", Nick);
        students.put("LuisZ1", Luis);
        students.put("T_ron", Terry);

//      INSTANCE OF A SCANNER
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!");

//      WHILE LOOP
        while (true) {
            System.out.println("\nHere are the GitHub usernames of our students:\n");

//          FOR LOOP
            for (Map.Entry<String, Student> set :students.entrySet()) {
 //         DISPLAYS STUDENT USERNAMES
                System.out.print("|" + set.getKey() + "|  ");
            }
//          LOOKS FOR KEY/VALUE
            System.out.println("\n\nWhat student would you like to see more information on? (Case Sensitive)");
            System.out.print("\n>");
//          ASSIGNS KEY/VALUE TO userInput
            String userInput = sc.nextLine();

//          IF ELSE STATEMENT
//          IF students does not contain userInput print:...
            if (!students.containsKey(userInput)) {
                System.out.println("\nSorry, no student found with the GitHub username of " + userInput);
            } else {
//          else prints name/github username and prints average grade
                System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput);
                System.out.println(students.get(userInput).getGradeAverage());
            }

            System.out.println("\nWould you like to see another students?");
            System.out.print("\n>");
            userInput = sc.nextLine();

//          IF STATEMENT
            if ((!userInput.equalsIgnoreCase("y")) && (!userInput.equalsIgnoreCase("yes"))) {
                System.out.println("\nGoodbye, and have a wonderful day!");

//             EXIT APPLICATION
               System.exit(0);
            }


        }
    }
}


