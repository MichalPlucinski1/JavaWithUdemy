package Pluto.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListChallenge {
    record Place(String name, int distance){
        @Override
        public String toString() {
            return String.format("%s (%d)", name, distance);
        }
    }


    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));

        placesToVisit.addFirst(new Place("Sydney", 0));

        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);

        boolean quitLoop = false;
        boolean forward = true;
        boolean start = true;
        boolean end = false;


        printMenu();

        while(!quitLoop){
            if(!iterator.hasPrevious())
            {
                System.out.println("Originating : " + iterator.next());
                forward = true;
                start = true;
            }
            if(!iterator.hasNext())
            {
                System.out.println("Originating : " + iterator.previous());
                forward = false;
                end = true;
            }
            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch (menuItem){
                case "F":
                System.out.println("User wants to go forward");

                if(end){
                    System.out.println("Out of range");

                }
                else {

                    if (iterator.hasNext()) {
                        if (!forward) {
                            forward = true;
                            iterator.next();
                        }
                        System.out.println(iterator.next());
                        start = false;
                    }
                }
                    break;
                case "B":
                    System.out.println("User wants to go backwards");

                    if(start){
                        System.out.println("Out of range");
                    }
                    else {
                        if (iterator.hasPrevious()) {
                            if (forward) {
                                forward = false;
                                iterator.previous();
                            }
                            System.out.println(iterator.previous());
                            end = false;
                        }
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;

            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p:list) {
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

            //inserting in right place
        int index = 0;
        for (Place p:list) {
            if(place.distance() < p.distance()){
                list.add(index,place);
                return;
            }
            index++;
        }
        list.add(place);

    }

    private static void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
