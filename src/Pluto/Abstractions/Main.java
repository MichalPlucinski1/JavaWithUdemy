package Pluto.Abstractions;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        ListItem root = new Node(10);
        MyLinkedList ll = new MyLinkedList(root);

        LinkedList<Boolean> errors = new LinkedList<>();



        LinkedList<Node> nodes = new LinkedList<>();

        for(int i = -12; i < 20; i+=4){
            nodes.add(new Node(i));
        }

        int i = 0;
        for (Node node:nodes) {
            errors.add(ll.addItem(nodes.get(i)));

            System.out.println(i++ + " " + node.value);

        }






        System.out.println("traverse:");

        ll.traverse(root);








    }
}
