import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] classicArray = {"zero", "two", "one"};
        ArrayList<String> aL = new ArrayList<>(List.of("Zero", "one", "two"));

        Arrays.sort(classicArray);
        System.out.println(Arrays.toString(classicArray));
        System.out.println(aL);
    }


}
