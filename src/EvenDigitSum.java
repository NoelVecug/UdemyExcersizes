public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if( number < 0){
            return -1;
        } else {
            int sum = 0;
          while (number > 0){
              int remaining = number % 10;
              number /= 10;
              if((remaining % 2) == 0){
                  sum += remaining;
              }
          } return sum;
        }
    }
}
