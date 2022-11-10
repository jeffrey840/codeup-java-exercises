public class MethodsExercises {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);

        System.out.println("sum result " + sumOfNumbers(11, 9));
        System.out.println("subtraction result " + subOfNumbers(10, 5));
        System.out.println("multiplication result " + multiply(15, 3));
        System.out.println("division result " + divide(25, 5));
        System.out.println("modulus result " + modulus(13, 3));
        count(5);
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

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }














}
