package LearningPackages.arraysAndLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class arraysAndLists {
    public static void main(String[] args) {


        ListChallenge.start();


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
        //also has addAll
        arrayList.remove(0);
        arrayList.sort(Comparator.naturalOrder()); //or reverseOrder()
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



    //ArrayList to array
        var ArrayFromAL = nextList.toArray(new String[nextList.size()]);


    //2D


        String[][] array2d = {
                {"first", "second", "third"},
                {"fourth", "fifth"}
        };

        System.out.println(Arrays.deepToString(array2d));

        ArrayList<ArrayList<String>> multiDList = new ArrayList<>();
        System.out.println(multiDList);


        //finding
        int a1 = Arrays.binarySearch(array, "Yo"); //must be sorted, returns index, if jnot ofund returns -1

        boolean b1 = arrayList.contains("hakunamatata");
        boolean b2 = arrayList.containsAll(Arrays.asList("Hakunamatata", "Yo"));

        int a2 = arrayList.indexOf("Yo"); //-1 if not
        int a3 = arrayList.lastIndexOf("Yo"); // also here




        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one"); //array also will be changed. also can't remove or add elements. not resizable now.


        //using var with lists

        //Arrays.asList("something", "something else"); not resizeable, but mutable
        //List.of("something", "something else"); immutable
        // also can use   String[] stringArray = someArrayList.toArray(new String[0]);
    }
}
