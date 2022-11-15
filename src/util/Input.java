package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {
    this.sc = new Scanner(System.in).useDelimiter("\n");
    }

//  Get string method asks for the user input and returns it
    public String getString(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();
    }

//  yesNo method asks the user if they want to continue y/yes = true, else false.
    public boolean yesNo() {
        String input = sc.next();
//        System.out.println(input);
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int userInt = sc.nextInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Please enter an integer in the correct range between " + min + " " + "and " + max);
            return getInt(min, max);
        }
    }

//        public int getNum() {
//        int userInt = sc.nextInt();
//        System.out.println("You entered " + userInt);
//        return getNum();
//    }

    public double getDouble(double min, double max) {
        double userInt = sc.nextInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Please enter an integer in the correct range between " + min + " " + "and " + max);
            return getDouble(min, max);
        }
    }

    public int getDbl() {
        double userInt = sc.nextInt();
        System.out.println("You entered " + userInt);
        return getDbl();
    }
//
//    public int gNum() {
//        int userInt = sc.nextInt();
//        System.out.println("You entered " + userInt);
//        return gNum();
//    }
//





    public static void main(String[] args) {
        Input in = new Input();

        String favSentence = in.getString("Please enter your favorite sentence!");
        System.out.println(favSentence);

        System.out.print("Do you want to continue? ");
        boolean yesNo = in.yesNo();
        System.out.println(yesNo);

        System.out.print("Please enter a whole number between 1 and 10: ");
        int numInRange = in.getInt(1, 10);
        System.out.println("You entered " + numInRange);



        System.out.print("Please enter a double number between 1.50 and 15.50: ");
        double dNum = (int) in.getDouble(1.50, 15.50);
        System.out.println("You entered " + dNum);

        System.out.print("Please enter a double number: ");
        double dnum = (int) in.getDbl();
        System.out.println("You entered: " + dnum);

        System.out.print("Please enter a whole number: ");
        int num = in.gNum();
        System.out.println("You entered: " + num);







    }

}
