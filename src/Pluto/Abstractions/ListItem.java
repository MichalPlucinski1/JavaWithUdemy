package Pluto.Abstractions;

public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract void setNext(ListItem rightLink);
    abstract ListItem previous();
    abstract void setPrevious(ListItem leftLink);
    abstract double compareTo(ListItem second);

    public Object getValue(){
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
