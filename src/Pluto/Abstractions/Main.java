package Pluto.Abstractions;


public class Main {
    public static void main(String[] args) {


        Node n1 = new Node(10);
        Node n2 = new Node(9);
        Node n3 = new Node(11);
        Node n4 = new Node(8);

        SearchTree bst = new SearchTree(n1);


        bst.addItem(n2);
        bst.addItem(n3);
        bst.addItem(n4);


        bst.traverse(n1);


    }



}

