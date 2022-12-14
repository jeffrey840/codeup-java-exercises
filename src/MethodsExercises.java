
import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);

        System.out.println("sum result " + sumOfNumbers(11, 9));
        System.out.println("subtraction result " + subOfNumbers(10, 5));
        System.out.println("multiplication result " + multiply(15, 3));
        System.out.println("division result " + divide(25, 5));
        System.out.println("modulus result " + modulus(13, 3));
        System.out.println("MultiplicationOne result: " + multiplicationOne(5, 2));
        System.out.println("MultiplicationTwo result: " + multiplicationTwo(5, 4));
        System.out.println("Multiplication Recursion result: " + multiplicationRecursion(2, 2));
        System.out.println("Multiplication Recursion result: " + multiplicationRecursionT(4, 4));

        getInteger(1, 5);
        getFactorials();
        diceRoll();
    }

    public static int sumOfNumbers(int num1, int num2){
        return num1 + num2;
    }

    public static int subOfNumbers(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }

//===================BONUS===================//

public static int multiplicationOne(int num1, int num2) {
    int initialValue = num1;
    for (int i = 1; i < num2; num2--) {
        num1 += initialValue; /* num1 = num1 + initialValue */
    }
    return num1;
}

    public static int multiplicationTwo(int num1, int num2) {
        int product = 0;
        for (int i = 0; i < num2; i++) {
            product += num1;/* num1 = num1 + product */
        }
        return product;
    }

    public static int multiplicationRecursion(int num, int num2){
        if(num2 <= 1) {
            return  num;
        } return num + multiplicationRecursion(num, num2 - 1);
    };


    public static int multiplicationRecursionT(int num, int num2) {
        return num2 <= 1 ? num : num + multiplicationRecursionT(num, num2 - 1);

    }

    public static int getInteger(int min, int max){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInput;
        if(input.hasNextInt()){
            userInput = input.nextInt();
        } else {
            System.out.println("Invalid. Try again.");
            return getInteger(min, max);
        }
        if (userInput < min || userInput > max){
            System.out.println("Invalid. Try again.");
            return getInteger(min, max);
        }else {
            return userInput;
        }

    }

    public static String getFactorials(){
        Scanner input = new Scanner(System.in);

        String keepGoing = "y";

        int userInput = getInteger(1, 10);
        String output = "";
        for (int i = 1; i <= userInput; i++) {
            output += getFactorials(i);
        }
        System.out.println(output);
        System.out.println("Keep Going? Y/N");
        keepGoing = input.nextLine();

        if(keepGoing.equalsIgnoreCase("y")){
            getFactorials();
        }else {
            System.out.println("Later");
        }
        return "";
    }

    public static String getFactorials(int num){
        String output = num + "! = ";
        long fact = 1L;
        for (int i = 1; i <= num; i++){
            output += " X " + i;
            fact *= i;
        }
        if(num == 10){
            output = output.substring(0, 5) + output.substring(8) + " = " + fact +"\n";
        }else{
            output = output.substring(0, 5) + output.substring(7) + " = " + fact +"\n";
        }
        return output;
    }

    public static void diceRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's roll some dice!");
        System.out.println("Enter the number of sides for a pair of dice.");
        int numberOfSides = sc.nextInt();
        while (true) {
            System.out.println("Type 'roll' to roll your dice.");
            String roll = sc.next().toLowerCase();
            if (roll.equals("roll")) {
                while (true) {
                    System.out.println("Die 1: " + ((int) Math.floor(Math.random() * (numberOfSides)) + 1));
                    System.out.println("Die 2: " + ((int) Math.floor(Math.random() * (numberOfSides)) + 1));
                    System.out.println("Would you like to roll again? (y/n)");
                    String again = sc.next().toLowerCase();
                    if (again.equals("n")) {
                        break;
                    }
                }
            } else {
                continue;
            }
            System.out.println("Thanks for playing!");
            break;
        }
    }


}


