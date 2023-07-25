package LearningPackages.MyCalculations;

public class Main {
    public static void main(String[] args) {

        System.out.println(calc(30));

    }





    public static String calc(int start){

        int sum = 0;
        int oneLeg = 0;
        int both = 0;


        while(start > 0){
            System.out.println("for start: " + start);
            sum += start * 2;
            both += start;
            oneLeg += start / 2;

            start-= 2;
        }


        return "both: " + both + " per one leg: " + oneLeg + " sum: " + sum;
    }

}


