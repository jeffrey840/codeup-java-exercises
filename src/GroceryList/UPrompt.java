package GroceryList;

import java.util.Scanner;

public class UPrompt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("How many items will be entered");
        int ItemsEntered = Integer.parseInt(scanner.nextLine().trim());

    }

}
