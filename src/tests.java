import java.util.ArrayList;

public class tests {
    public static void main(String[] args) {

        record Person(String name, ArrayList<Double> transaction){

            public Person(String name, ArrayList<Double> transaction){
                this.name = name;
                this.transaction = new ArrayList<>();
            }
        }

        Person p1 = new Person("M", null);
        Person p2 = new Person("T", null);
        Person p3 = new Person("L", null);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        System.out.println(persons);

        p1.transaction.add(5.0);
        System.out.println(persons);

    }
}
