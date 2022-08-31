public class SumOdd {
    public static boolean isOdd(int number){
        return ((number > 0) && (number % 2 != 0));
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if((start > 0) && (end > 0) && (end >= start)){
            for(; start <= end; start++){
                if(isOdd(start)){
                    sum += start;
                }
            }
        } else {
            return -1;
        }
        return sum;
    }
}
