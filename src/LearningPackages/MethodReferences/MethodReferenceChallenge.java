package LearningPackages.MethodReferences;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;



public class MethodReferenceChallenge {
    private static Random random = new Random();







    public static char getRandomChar(char start, char end) {
        return (char) random.nextInt( (int) start, (int) end + 1 );
    }

    public static ArrayList<String> applyOperations(ArrayList<String> names, List<UnaryOperator<String>> operations){
        ArrayList<String> changedNames = new ArrayList<>();

        for(var o:operations){
            names.replaceAll(s -> s.transform(o));

        }

        return changedNames;

    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("aNna", "mArtyNA", "Kuba", "MiRoslaw", "kATARZYNA", "BoB"));
        names.forEach(System.out::println);
        UnaryOperator<String> addLastName = (String s) ->{
            System.out.println("adding last name");
            System.out.println("effect: " + s + " " + new StringBuilder(s).reverse().toString());
            return s + " " +  new StringBuilder(s).reverse().toString();
        };

        UnaryOperator<String> fixCases = (String s) ->{

            System.out.println("fixing cases of " + s);
            String name = s.substring(0, s.indexOf(" ") - 1);
            System.out.println("name = " + name);
            String surname = s.substring(s.indexOf(" ") + 1, s.length() - 1);
            System.out.println("surname = " + surname);

            return (char) (name.charAt(0) + 32) +
                    name.substring(1).toLowerCase() + " " +
                    surname.substring(0,1).toUpperCase() +
                    surname.substring(1).toLowerCase();
        };

        UnaryOperator<String> addMiddleInitial = (String s) ->{
            System.out.println("adding middle initial to " + s);
            String[] parts = s.split(" ");
            return parts[0] + " " + getRandomChar('a', 'z') + " " + parts[1];
        };



        List<UnaryOperator<String>> operations = new ArrayList<>(List.of(
                String::toUpperCase,
                addLastName,
                //fixCases,
                addMiddleInitial
        ));


        names = applyOperations(names,operations);


        names.forEach(System.out::println);

    }


}
