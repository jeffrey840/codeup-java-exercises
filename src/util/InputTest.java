package util;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();

        String favSentence = in.getString("Enter a sentence");
        System.out.println(favSentence);

        System.out.print("Do you want to continue? ");
        boolean yesNo = in.yesNo();
        System.out.println(yesNo);

        System.out.print("Enter a whole number between 1 and 10: ");
        int numInRange = in.getInt(1, 10);
        System.out.println("You entered " + numInRange);

        System.out.print("Please enter a whole number: ");
        int num = in.getNum();
        System.out.println("You entered: " + num);

        System.out.print("Please enter a double number between 1.50 and 15.50: ");
        double dNum = in.getDouble(1.50, 15.50);
        System.out.println("You entered " + dNum);

        System.out.print("Please enter a double number: ");
        double dnum = in.getDbl();
        System.out.println("You entered: " + dnum);


    }
}



