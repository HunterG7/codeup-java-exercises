import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {
        //1
        Person[] people = new Person[3];
        people[0] = new Person("Dan");
        people[1] = new Person("Kim");
        people[2] = new Person("Joe");
        for (Person person : people){
            System.out.println(person.getName());
        }

        System.out.println("---------------------");

        Person me = new Person("Hunter");
        Person[] updatedPeople = addPerson(people, me);
        for (Person person : updatedPeople){
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person newPerson){
        Person[] updatedPeople = Arrays.copyOf(people, people.length + 1);
        updatedPeople[people.length] = newPerson;
        return updatedPeople;
    }
}