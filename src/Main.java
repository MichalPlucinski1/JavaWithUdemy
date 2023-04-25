public class Main {
    public static void main(String[] args) {
        //System.out.println(1000);

        //System.out.println(sumDigits(5525));
        //System.out.println(sumFirstAndLastDigit(101));
        //StudentRecord s1 = new StudentRecord("John",2);
        //System.out.println(s1);
        Calculator calc = new Calculator(new Floor(50,50), new Carpet(8));
        System.out.println(calc.getTotalCost());

    }

    public static int addingNumbers() {
        int sum = 0;
        int howMuch = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                howMuch++;
                System.out.println(i + " ");

                if (howMuch == 5)
                    break;
            }
        }

        return sum;
    }

    public static boolean isOdd(int number) {
        if(number < 0)
            return false;
        return (number % 2 == 1);
    }

    public static int sumOdd(int start, int end){

        if((start < 0) || (end < 0) ||( start > end))
            return -1;
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i))
                sum += i;
        }
        return sum;
    }

    public static int sumDigits(int number){
        if(number < 0)
            return -1;
        int sum = 0;

        do {
            sum += number % 10;
            number /= 10;
        }while(number> 0);
        return sum;
        }


    public static int sumFirstAndLastDigit(int number){
            int last = number % 10;
            int first = number;

            while(first >= 10){
                first/=10;
            }

        System.out.println("first " + first + " last: " + last);
            return first + last;

        }


}



