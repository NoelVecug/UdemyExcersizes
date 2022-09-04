public class GreatestCommonDivision {
    public static int getGreatestCommonDivisor(int first, int second){
            if((first >= 10) && (second >= 10)){
                int divide = 0;
                if (first > second){
                    divide = first;
                } else {
                    divide = second;
                }
                while (divide > 0){
                    int remainingFirst = first % divide;
                    int remainingSecond = second % divide;
                    if ((remainingFirst == 0) && (remainingSecond == 0)){
                        return divide;
                    }
                    divide--;
                }

            } return -1;
    }
}
