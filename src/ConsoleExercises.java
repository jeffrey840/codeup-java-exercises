import java.util.Scanner;



public class ConsoleExercises {

    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %s", pi);

        double pi = 3.14159;
        String piStat = "The value of pi is approximately ";
        System.out.format("%s%s%n", piStat, pi);
//    Explore the Scanner Class.
//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Enter an integer: ");
        int nextInt = scanner.nextInt();
        System.out.println(nextInt);

//        What happens if you input something that is not an integer?
//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Enter a word: ");
        String firstWord = scanner.next();
        System.out.println("Enter another word: ");
        String secondWord = scanner.next();
        System.out.println("Enter a final word: ");
        String thirdWord = scanner.next();
        System.out.printf("%n%s %n%s %n%s\n", firstWord, secondWord, thirdWord);


        System.out.println("Enter a sentence: ");
        String userInput = scanner.next();
        System.out.println(userInput);


        System.out.println("Calculate the perimeter and area of this room.");
        System.out.println("Enter the length of the room: ");
        int length = scanner.nextInt();
        System.out.println("Enter the width of the room: ");
        int width = scanner.nextInt();
        System.out.println("Enter the height of the room: ");
        int height = scanner.nextInt();

        System.out.println("The perimeter of the room is " + (length * 2 + width * 2));
        System.out.println("The area of the room is " + (length * width));
        System.out.println("The volume of the room is " + (length * width * height));

        System.out.println(Long.MAX_VALUE);
    }

}


//

//
//        What happens if you enter less than 3 words?
//        What happens if you enter more than 3 words?
//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
//        do you capture all the words?
//        Rewrite the above example using the nextLine method.
//
//        Calculate the perimeter and area of Codeup's classrooms.
//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//
//        Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
//        Display the area and perimeter of that classroom.
//
//        The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//
//        Bonuses
//        In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.
//
//        The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//
//
//        scanner.useDelimiter("\n");
//        How does this change the way your program operates?
//
//        Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.


