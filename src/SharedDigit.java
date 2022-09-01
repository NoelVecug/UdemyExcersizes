public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if (((num1 < 10) || (num1 > 99)) || ((num2 < 10) || (num2 > 99))) {
            return false;
        } else {
            while ((num1 > 0) && (num2 >0)){
                int reminderNum1 = num1 % 10;
                num1 /= 10;
                int reminderNum2 = num2 % 10;
                num2 /= 10;
                if((reminderNum1 == reminderNum2) || (reminderNum1 == num2)){
                    return true;
                } else return (num1 == reminderNum2) || (num1 == num2);
            }
        } return false;
    }
}
