package Pluto.Abstractions;


public class Main {
    public static void main(String[] args) {


        Node n1 = new Node(11);
        Node n2 = new Node(13);
        Node n3 = new Node(15);
        Node n4 = new Node(8);
        Node n5 = new Node(9);
        Node n6 = new Node(12);

        ListItem root = new Node(10);
        MyLinkedList ll = new MyLinkedList(root);

        ll.addItem(n4);
        ll.addItem(n5);
        ll.addItem(n3);
        System.out.println("traverse:");

        ll.traverse(root);








    }
}
