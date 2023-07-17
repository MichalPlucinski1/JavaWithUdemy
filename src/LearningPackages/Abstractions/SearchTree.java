package LearningPackages.Abstractions;

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
        if(root == null) {
            root = item;
            return true;
        }
        ListItem iterator = root;

        while(iterator != null){

            if( iterator.compareTo(item) < 0){
                if(iterator.previous() == null){
                    iterator.setPrevious(item);
                    return true;
                }
                else{
                    iterator = iterator.previous();
                }
            } else if( iterator.compareTo(item) > 0) {
                if (iterator.next() == null) {
                    iterator.setNext(item);
                    return true;
                } else {
                    iterator = iterator.next();
                }
            }
            else
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
        if(root == null){
            System.out.println("The list is empty");
            return;
        }
        traverse(root.leftLink);
        System.out.println(root.value);
        traverse(root.rightLink);


    }
}
