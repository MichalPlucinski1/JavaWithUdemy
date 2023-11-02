package LearningPackages.MethodReferences;


import java.util.Arrays;
import java.util.function.*;

class PlainOld{
    private static int last_id = 1;
    private int id;

    public PlainOld(){
        id = PlainOld.last_id++;
        System.out.println("Creating a Plain Object " + id);
    }
}

public class MR {
    public static void main(String[] args) {
        calculator(Integer::sum, 10, 25);
        calculator(Double::sum, 10.5, 25.3);
        Supplier<PlainOld> reference2 = PlainOld::new;
        PlainOld newPojo = reference2.get();

        System.out.println("\n Gettign array");
        PlainOld[] pojo1 = seedArray(PlainOld::new, 10);


        calculator(String::concat, "Hello ", "World");

        BinaryOperator<String> b1 = String::concat;
        BiFunction<String, String, String> b2 = String::concat;
        UnaryOperator<String> u1 = String::toUpperCase;

        System.out.println(b1.apply("Hello ", "World"));
        System.out.println(b2.apply("Hello ", "World"));
        System.out.println(u1.apply("Hello"));

        String result = "Hello".transform(u1);
        System.out.println("Result = " + result);


        result = result.transform(String::toLowerCase);
        System.out.println("Result = " + result);

        Function<String, Boolean> f0 = String::isEmpty;
        boolean resultBoolean = result.transform(f0);
        System.out.println("Result = " + resultBoolean);


    }
    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1, value2);
        System.out.println("result of operation  " + result);
    }

    private static PlainOld[] seedArray(Supplier<PlainOld> reference, int count){
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array, i -> reference.get());
        return array;
    }
}
