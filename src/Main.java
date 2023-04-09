public class Main {
    public static void main(String[] args) {
        System.out.println(1000);

    //    printYearsAndDays(561600);

    }

    public static boolean isCatPlaying   (boolean summer, int temperature){
        if( (!summer) && ((temperature >= 25) && (temperature <= 35)) ){
            return true;
        }
        if((summer) && ((temperature >= 25) && (temperature <= 45)) ){
            return true;
        }
        return false;
    }



}
