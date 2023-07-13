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
                    if(iterator.compareTo(item) > 0){ //item is bigger -> replacing iterator
                        item.setNext(iterator.next());
                        item.setPrevious(iterator);
                        iterator.next().setPrevious(item);

                        iterator.setNext(item);
                        return true;
                    }
                    else if(iterator.compareTo(item) < 0){  //item is still smaller -> continue to traverse
                        iterator = iterator.previous();

                    }
                    else { //if equal
                        return false;
                    }
                } // iter.prev is null
                if(iterator.compareTo(item) < 0) { // if smaller, add at the end
                    item.setNext(iterator);
                    iterator.setPrevious(item);
                    return true;
                }else if(iterator.compareTo(item) > 0){ //if bigger, replace iter
                    iterator.next().setPrevious(item);
                    item.setNext(iterator.next());
                    item.setPrevious(iterator);
                    iterator.setNext(item);
                    return true;
                }
                else return false;



        } else if (root.compareTo(item) > 0) { //item is bigger
                ListItem iterator = root;
                while(iterator.next() != null){
                    if(iterator.compareTo(item) < 0){ //replacing -> item going before item
                        System.out.println("item " + item.value + " going before " + iterator.value);
                        iterator.previous().setNext(item);
                        item.setNext(iterator);
                        item.setPrevious(iterator.previous());
                        iterator.setPrevious(item);
                        return true;
                    }
                    else if(iterator.compareTo(item) > 0){
                        System.out.println("item " + item.value + " smaller then " + iterator.value + ", continue to search");
                        iterator = iterator.next();
                    }
                    else return false;
                }
                if(iterator.compareTo(item) > 0){
                    System.out.println("item added at the end");
                    item.setPrevious(iterator);
                    iterator.setNext(item);
                    return true;
                } else if (iterator.compareTo(item) < 0) {
                    System.out.println("item added before " + iterator.value);
                    iterator.previous().setNext(item);
                    item.setPrevious(iterator.previous());
                    iterator.setPrevious(item);
                    item.setNext(iterator);

                    System.out.println("item: " + item.previous().value + " " + item.value + " " + item.next().value);
                    System.out.println("iterator: " + iterator.previous().value + " " + iterator.value + " " + null);
                    return true;
                }


                return false;
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
