public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        } else {
            int divide = number;
            int check = 0;
            while (divide > 0){
                int remaining = number % divide;
                if ((remaining == 0) && (divide != number)){
                    check+= divide;
                }
                divide--;
            } return check == number;
        }
    }
}
