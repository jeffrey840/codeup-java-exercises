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



}
