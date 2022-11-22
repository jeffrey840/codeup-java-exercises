package ExeptionAndErrorHandling;

public class CatchingExeptions {


//    ===============FIRST EXAMPLE
//    Here is a generic form of what a try-catch block looks like:
//    try {
//        // something that
//        // might go wrong
//    } catch (Exception e) {
//        // handle the error
//    }

//    main method
//    public static void main(String[] args) {
//
//
//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.out.println("Math still works!");
//        }
////        print out:
////        Let's see...
////        Math still works!
//
//    }
//    ==============SECOND EXAMPLE
public static void main(String[] args) {

    int[] numbers = {1, 2, 3};
    int x;

    try {
        x = numbers[100];
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Caught an array index exception!");
    } catch (Exception e) {
        System.out.println("Caught a generic exception!");
    } finally {
        System.out.println("This will always run.");
    }

//    PRINTS:
//    Caught an array index exception!
//    This will always run.
}

}
