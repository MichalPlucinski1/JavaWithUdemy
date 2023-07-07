package Pluto.arraysAndLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListChallenge {

    public static void start(){
        boolean go = true;
        ArrayList<String> groceries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(go){

            System.out.println("type what you wanna do: ");

            switch (Integer.parseInt(scanner.nextLine())) {
                case 0 ->  go = false;
                case 1 ->  addItems(groceries);
                case 2 ->  removeItems(groceries); //remove items (comma delimited list)

                default-> System.out.println("wrong data, try again");

            }

            groceries.sort(Comparator.naturalOrder());

            //printList
            System.out.println(groceries);
        }
    }

    public static void addItems(ArrayList<String> groceries){
        Scanner scanner = new Scanner(System.in);
        System.out.println("to add, type elements, delimiteds by comma");
        String[] items = scanner.nextLine().split(",");


        for ( String i: items ) {
            String trimmed = i.trim(); //removes spaces
            if(groceries.indexOf(trimmed) < 0){
                groceries.add(trimmed);
            }
        }
    }

    public static void removeItems(ArrayList<String> groceries){
        Scanner scanner = new Scanner(System.in);
        System.out.println("to remove, type elements, delimiteds by comma");
        String[] items = scanner.nextLine().split(",");
        groceries.removeAll(List.of(items));
        for ( String i: items ) {
            String trimmed = i.trim(); //removes spaces
            groceries.remove(trimmed);
        }
    }

}
