package Pluto.Abstractions;

public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }


    @Override
    void setNext(ListItem rightLink) {
        this.rightLink = rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    void setPrevious(ListItem leftLink) {
        this.leftLink = leftLink;
    }

    @Override
    double compareTo(ListItem second) {

        return Double.parseDouble(second.value.toString() ) - Double.parseDouble(value.toString());

    }


}
