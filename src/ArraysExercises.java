

import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] people, Person person){

        Person[] oneMorePerson = Arrays.copyOf(people, people.length +1);
        oneMorePerson[oneMorePerson.length - 1] = person;
        return oneMorePerson;

    }
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person[] people = new Person[3];
        people[0] = new Person("john");
        people[1] = new Person("ronn");
        people[2] = new Person("erin");

        people = addPerson(people, new Person("sam"));
        for(Person instructor: people){
            System.out.println(instructor.getName());
        }
    }

}


