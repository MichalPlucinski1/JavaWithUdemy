package LearningPackages.Lambda.BigChallenge;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

    private static Random random = new Random();
    public static void main(String[] args) {


        String[] names = {"aNna", "mArtyNA", "Kuba", "MiRoslaw", "kATARZYNA", "BoB"};
        List list = new ArrayList<>(List.of(names));

        UnaryOperator<String> allToUpper = ((String s) -> s.toUpperCase());

        list.replaceAll(allToUpper);

        //or

        Arrays.setAll(names, i->names[i].toUpperCase());

        //next


        System.out.println(list);

        UnaryOperator<String> addLastName = (String s) ->{
            return s + " " +  new StringBuilder(s).reverse().toString();
        };

        list.replaceAll(addLastName);
        list.forEach(System.out::println);



        Predicate<String> isEqual = (String s) -> {
            String[] arr = s.split(" ");
            return Objects.equals(arr[0], arr[1]);
        };


        ArrayList<String> noEquals = new ArrayList<>();

        removeEquals(list, noEquals, isEqual);

        System.out.println(noEquals);








    }

    public static char getRandomChar(char start, char end) {
        return (char) random.nextInt( (int) start, (int) end + 1 );
    }


    public static void removeEquals(List<String> source, List <String> output , Predicate<String> func){
        output.addAll(source);
        output.removeIf(func);
    }
}
