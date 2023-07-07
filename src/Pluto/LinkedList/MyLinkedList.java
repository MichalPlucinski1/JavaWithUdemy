package Pluto.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[]args){
        LinkedList<String> items = new LinkedList<>();

        items.add("Sydney");
        items.add(0, "Canberra");
        items.addFirst("Warsaw");
        items.addLast("Wroclaw");

        items.offer("offer");
        items.offerFirst("of");
        items.offerLast("OL");
        items.add("toRemove");

        items.push("push");
        System.out.println("before removing: \n" + items + "\n\n");

        ArrayList<Object> removed = new ArrayList<>();

        String s1 = items.remove(4);
        boolean s2 = items.remove("toRemove");
        String s3 = items.removeFirst();
        removed.add(s1);
        removed.add(s2);
        removed.add(s3);

        System.out.println("after removing: \n" + items + "\n\n");
        System.out.println("removed: " + removed.toString());

        items.add("first");
        items.add("second");
        removed.add(items.poll()); // removes first
        removed.add(items.pop()); // removes first

        items.get(2);





        //items.remove()
        System.out.println("after removing: \n" + items + "\n\n");
        System.out.println("removed: " + removed.toString());

        //queue retrival method
        System.out.println("Element from element() = " + items.element());
        //stack retrival methods
        System.out.println("Element from peek() = " + items.peek());
        System.out.println("Element from peekFirst() = " + items.peekFirst());
        System.out.println("Element from peekLast() = " + items.peekLast());

    }
}
