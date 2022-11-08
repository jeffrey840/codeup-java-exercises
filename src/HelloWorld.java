



public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, World! & ");
        System.out.print("Hey there, again. ");

        int myFavoriteNumber = 25;
        System.out.println(myFavoriteNumber);

        String myString = "Here is my string";
//        String myString = w;
//        String myString = 3.14159;
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);


//        first output was 5 and 6
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        second output was 6 and 6

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        returns an error : Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//	at HelloWorld.main(HelloWorld.java:36)

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);

//        returns error : java: incompatible types: java.lang.String cannot be converted to int.
//        int three = (int) "three";

        int a = 4;
        a += 5;  /* a = a + 5; */
        System.out.println(a);

        int b = 3;
        int y = 4;
        y *= b; /* y = y * b; */
        System.out.println(y);

        int o = 10;
        int k = 2;
        o /= k; /* o = o / k;  5 is now stored in 'o'   */
        k -= o; /* k = k - o; */
        System.out.println(o);
        System.out.println(k);


        int m = Integer.MAX_VALUE;
        System.out.println(m);/* 2147483647 */
        m += 1;
        System.out.println(m);/* -2147483648 */
    }


}


