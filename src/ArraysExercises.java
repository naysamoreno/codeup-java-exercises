import java.util.Arrays;

public class ArraysExercises extends Person{
    public static Person[] addPerson(Person[] arr, Person addPerson) {
        Person[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = addPerson;
        return newArr;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        String[] people = new String[3];

//        String[] people = {"Becky", "Joe", "Lisa"};
//
//        for (int i = 0; i < people.length; i += 1) {
//            System.out.println(people[i]);
//        }
        Person[] people = new Person[3];
        people[0] = new Person("Naysa");
        people[1] = new Person("Becky");
        people[2] = new Person("Joe");

        for (int i = 0; i < people.length; i += 1) {
            System.out.println(people[i]);
        }
        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println("----------------");
        Person austin = new Person(("Austin"));
        people = addPerson(people, austin);

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}