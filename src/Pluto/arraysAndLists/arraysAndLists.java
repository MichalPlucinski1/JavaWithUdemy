package Pluto.arraysAndLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class arraysAndLists {
    public static void main(String[] args) {

        //Standard array
        String[] array = new String[2];
        array[0] = "Yo";
        array[1] = "boi";
        int[] arrOfInt = {2, 4, 1, 2, 0};
        Arrays.sort(arrOfInt);
        System.out.println(Arrays.toString(arrOfInt));



        //ArrayList
        ArrayList<String> arrayList = new ArrayList<>(); //bez <> daje object
        arrayList.add("hakunamatata");
        arrayList.add("dom");
        arrayList.add("zupa");
        arrayList.add("drzewo");
        arrayList.add("Hakunamatata");
        arrayList.add(0, "yeah"); //or set, to change, not push
        arrayList.remove(0);
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);


        //List
        List<String> list = List.of(array);

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");

        System.out.println("list.of(): " + list);

        // making arrayList from array


        //  String[] array = new String[2];
        //  List<String> list = List.of(array);
        ArrayList<String> nextList = new ArrayList<>(list);
        nextList.removeAll(List.of("Yo"));   //retainAll removing everything except parameter
        System.out.println("nextList: " + nextList);
        System.out.println(nextList.get(0));







    }
}
