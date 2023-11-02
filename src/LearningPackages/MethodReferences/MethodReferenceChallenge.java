package LearningPackages.MethodReferences;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;



public class MethodReferenceChallenge {

    private static Random random = new Random();
    ArrayList<String> names = new ArrayList<>(List.of("aNna", "mArtyNA", "Kuba", "MiRoslaw", "kATARZYNA", "BoB"));

    UnaryOperator<String> addLastName = (String s) ->{
        return s + " " +  new StringBuilder(s).reverse().toString();
    };

    UnaryOperator<String> fixCases = (String s) ->{
        String name = s.substring(0, s.indexOf(" "));
        String surname = s.substring(s.indexOf(" ") + 1, s.length() - 1);

        return name.substring(0,1).toUpperCase() +
                name.substring(1,name.length() - 1) + " " +
                surname.substring(0,1).toUpperCase() +
                surname.substring(1,surname.length() - 1);
    };

    UnaryOperator<String> addMiddleInitial = (String s) ->{
        String[] parts = s.split(" ");
        return parts[0] + " " + getRandomChar('a', 'z') + " " + parts[1];
    };

    List<UnaryOperator<String>> operations = new ArrayList<>(List.of(
            String::toUpperCase,
            addLastName,
            fixCases,
            addMiddleInitial
    ));


    public static char getRandomChar(char start, char end) {
        return (char) random.nextInt( (int) start, (int) end + 1 );
    }

    public static void applyOperations(ArrayList<String> names, List<UnaryOperator> operations){
        ArrayList<String> changedNames = new ArrayList<>();
    }


}
