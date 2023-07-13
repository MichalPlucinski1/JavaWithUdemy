package Pluto.Abstractions;

public class SearchTree implements NodeList{
    ListItem root;

    public SearchTree(ListItem root) {
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
        if(root.compareTo(item) < 0){
            root.setPrevious(item);
        } else if (root.compareTo(item) > 0) {
            root.setNext(item);
        }
        else
            return false;

        return true;
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
        if(root == null){
            System.out.println("The list is empty");
            return;
        }
        traverse(root.leftLink);
        System.out.println(root.value);
        traverse(root.rightLink);


    }
}
