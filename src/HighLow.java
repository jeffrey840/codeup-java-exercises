import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        highLow();
    }

    public static void highLow() {
        int secretNumber = (int) Math.floor(Math.random() * (100) + 1);
        Scanner sc = new Scanner(System.in);
        int numberOfTries = 0;
        System.out.println("Select a number from 1 and 100.\nYou have 8 tries.");
        while (true) {
            int userGuess = sc.nextInt();
            numberOfTries++;
            if (secretNumber == userGuess) {
                System.out.println("GOOD GUESS! It took you " + numberOfTries + " of tries!");
                break;
            } else if (userGuess > secretNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("HIGHER");
            }
            if (numberOfTries > 7) {
                System.out.println("Game Over!, the answer was " + secretNumber);
                break;
            }
        }
    }
}