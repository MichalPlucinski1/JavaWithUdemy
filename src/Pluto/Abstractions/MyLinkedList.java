package Pluto.Abstractions;

public class MyLinkedList implements NodeList {

    ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        //should add item, avoiding duplicated, must use Node.compareTo()
        System.out.println("adding " + item.value);
        if(root == null){
            root = item;
            return true;
        }

            if(root.compareTo(item) < 0){ //item is smaller
                System.out.println("is smaller then root, adding on beginning");
                ListItem iterator = root;
                while(iterator.previous() != null){
                    if(iterator.compareTo(item) > 0){ //first time, when item will be bigger
                        item.setNext(iterator);
                        item.setPrevious(iterator.previous());
                        iterator.previous().setNext(item);
                        iterator.setPrevious(item);
                        return true;
                    }
                    iterator = iterator.previous();
                }
                System.out.println("got to the end");
                iterator.setPrevious(item);
                item.setNext(iterator);


                return true;



        } else if (root.compareTo(item) > 0) { //item is bigger
                /*if(root.next() == null)
                {
                    root.setNext(item);
                    item.setPrevious(root);
                    return true;
                }*/
                ListItem iterator = root;
                while(iterator.next() != null){
                    if(iterator.compareTo(item) < 0){ //first time, when item will be smaller
                        item.setNext(iterator);
                        item.setPrevious(iterator.previous());
                        iterator.previous().setNext(item);
                        iterator.setPrevious(item);
                        return true;
                    }
                    iterator = iterator.next();
                }
                iterator.setNext(item);
                item.setPrevious(iterator);


                return true;
        }
            return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(root == item){
            root = null;
            return true;
        }

        if(root == null){
            return false;
        }
        if(root.compareTo(item) < 0){
            removeItem(root.leftLink);
        } else if (root.compareTo(item) > 0) {
            removeItem(root.rightLink);
        }
        return false;

    }

    @Override
    public void traverse(ListItem root) {
        ListItem iterator = root;
        //setting iterator of first element

        while(iterator.previous()!= null){
            iterator = iterator.previous();
        }

        while(iterator!=null){//
            System.out.println(iterator.value);
            iterator = iterator.next();
        }

        System.out.println("The list is empty");

    }
}
