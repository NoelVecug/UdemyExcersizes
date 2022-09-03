public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if((isValid(num1) && (isValid(num2) && (isValid(num3))))){
            int remainNum1 = num1 % 10;
            int remainNum2 = num2 % 10;
            int remainNum3 = num3 % 10;
            return ((remainNum1 == remainNum2) || (remainNum1 == remainNum3) || (remainNum2 == remainNum3));
        } else {
            return false;
        }
    }

    public static boolean isValid(int nums){
        return (nums >= 10) && (nums <= 1000);
    }
}
