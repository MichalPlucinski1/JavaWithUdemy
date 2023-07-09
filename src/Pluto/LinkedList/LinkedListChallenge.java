package Pluto.LinkedList;

import java.util.LinkedList;

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
            if(place.distance() < )
            index++;
        }

        list.add(place);

    }


}
