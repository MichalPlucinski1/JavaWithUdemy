package LearningPackages.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Challenges {

    public static void main(String[] args) {
        Consumer<String> printTheParts = (sentence) -> {
            List<String> parts = new ArrayList<>(List.of(sentence.split(" ")));
            parts.forEach(s-> System.out.println(s));
        /*

            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
         */
        };

        Consumer<String> printThePartsConcise = (sentence) -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

         printThePartsConcise.accept("let's split this up into an array");





    }

}
