public class AllFactors {
    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        } else {
            int dividedNum = number;
            while (dividedNum > 0){
                int remainder = number % dividedNum;
                if (remainder == 0){
                    System.out.println(number / dividedNum);
                }
                dividedNum--;
            }
        }
    }
}
