package LearningPackages.Lambda.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person (String firstName, String lastName){
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }


    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Lucy", "Van Pelt"),
                new Person("Sally", "Brown"),
                new Main.Person("Linus", "Van Pelt"),
                new Main.Person("Peppermint", "Patty"),
                new Main.Person("Charlie", "Brown")));

        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));


        people.sort(new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2){
                return o1.lastName().compareTo(o2.lastName());
            }

        });
        System.out.println(people);

    }
}
