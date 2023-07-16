package Pluto.myInterfaces;

interface FlightEnabled{
    void takeOff();

    void land();

    void fly();
}

interface Trackable{
    void track();
}

public abstract class Animal {
    public abstract void move();
}
