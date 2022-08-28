public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3){
        if (isTeen(num1)){
            return true;
        } else if (isTeen(num2)){
            return true;
        } else return isTeen(num3);
    }
    public static boolean isTeen(int num){
        return num >= 13 && num <= 19;
    }
}
