package LearningPackages.Lambda;

import java.util.function.Function;

public class Challenge2 {
    public static void main(String[] args) {

        Function<String, String> f = ((String source) -> {
            StringBuilder out = new StringBuilder();
            for(int i = 0; i < source.length(); i+=2){
                out.append(source.charAt(i));
            }

            return out.toString();
        });
        System.out.println(everySecondChar(f, "1234567890"));

    }


    public static String everySecondChar(Function<String, String> f, String source){
        return f.apply(source);
    }
}
