package ExeptionAndErrorHandling;

public class CatchingExeptions {


//    Here is a generic form of what a try-catch block looks like:
//    try {
//        // something that
//        // might go wrong
//    } catch (Exception e) {
//        // handle the error
//    }

//    main method
    public static void main(String[] args) {


        try {
            System.out.println("Let's see...");
            int result = 1 / 0;
            System.out.println("I can divide by zero!");
        } catch (ArithmeticException e) {
            System.out.println("Math still works!");
        }
//        print out:
//        Let's see...
//        Math still works!

    }
}
