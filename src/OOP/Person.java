package OOP;

public class Person {

//    two instance variables
    public String firstName;
    public String lastName;

//    instance method sayHello()
    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {

//        made  a new instance of Person class
        Person rick = new Person();

//        assigning values to the object firstName and lastName
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";

//        calling the say hello method and getting result
        System.out.println(rick.sayHello());
        // prints "Hello from Rick Sanchez!"


        Person ada = new Person();
        ada.firstName = "Ada";
        ada.lastName = "Lovelace";

        Person grace = new Person();
        grace.firstName = "Grace";
        grace.lastName = "Hopper";

        System.out.println(ada.sayHello());   // "Hello from Ada Lovelace!"
        System.out.println(grace.sayHello()); // "Hello from Grace Hopper!"



    }

}
