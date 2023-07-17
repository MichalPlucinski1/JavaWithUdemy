package LearningPackages.Abstractions;

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
        if(root == null){
            root = item;
            return true;
        }

            if(root.compareTo(item) < 0){ //item is smaller then root
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
                        iterator.previous().setNext(item);
                        item.setNext(iterator);
                        item.setPrevious(iterator.previous());
                        iterator.setPrevious(item);
                        return true;
                    }
                    else if(iterator.compareTo(item) > 0){
                        iterator = iterator.next();
                    }
                    else return false;
                }
                if(iterator.compareTo(item) > 0){
                    item.setPrevious(iterator);
                    iterator.setNext(item);
                    return true;
                } else if (iterator.compareTo(item) < 0) {
                    iterator.previous().setNext(item);
                    item.setPrevious(iterator.previous());
                    iterator.setPrevious(item);
                    item.setNext(iterator);

                    return true;
                }


                return false;
        }
            return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        System.out.println("removing " + item.value);
        if(root == null){
            root = item;
            return true;
        }

        ListItem iterator = root;
        //setting iterator of first element

        while(iterator.previous()!= null){
            iterator = iterator.previous();

        }
        while(iterator.next()!= null){
            if(iterator.value == item.value){
                if(iterator.previous() == null){
                    iterator.next().setPrevious(null);
                    return true;
                }
                if(iterator.next() == null){
                    System.out.println("before last");
                    iterator.previous().setNext(null);
                    return true;
                }
                else
                iterator.next().setPrevious(iterator.previous());
                iterator.previous().setNext(iterator.next());

                return true;
            }
            iterator = iterator.next();

        }
        if(iterator.value == item.value){
            iterator.previous().setNext(null);
            return true;
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
