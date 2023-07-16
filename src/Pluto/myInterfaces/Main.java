package Pluto.myInterfaces;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        /*animal.move();

        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();*/


        inFlight(flier);

    }

    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
}
