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

            if(root.compareTo(item) < 0){ //item is smaller then root
                System.out.println("is smaller then root, adding on beginning");
                ListItem iterator = root;
                while(iterator.previous() != null){
                    if(iterator.compareTo(item) < 0){
                        iterator = iterator.previous();
                    }
                    else if(iterator.compareTo(item) == 0){
                        return false;
                    }
                    else {
                        item.setNext(iterator.next());
                        item.setPrevious(iterator);
                        iterator.setNext(item);
                        return true;
                    }
                }
                if(iterator.compareTo(item) < 0) {
                    item.setNext(iterator);
                    iterator.setPrevious(item);
                }else if(iterator.compareTo(item) > 0){
                    item.setNext(iterator.next());
                    item.setPrevious(iterator);
                    iterator.setNext(item);
                }
                else return false;



        } else if (root.compareTo(item) > 0) { //item is bigger
                System.out.println("still in develop");
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
