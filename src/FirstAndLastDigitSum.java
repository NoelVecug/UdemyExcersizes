public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        if( number < 0){
            return -1;
        } else {
            sum += number % 10;
            while (number > 0){
                if(number < 10){
                    int remaining = number % 10;
                    sum += remaining;
                    break;
                }
                number /= 10;
            }
            return sum;
        }
    }
}
