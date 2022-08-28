public class NumbersOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        } else {
            int calculate = year % 4;
            if (calculate != 0) {
                return false;
            } else {
                calculate = year % 100;
                if (calculate != 0) {
                    return true;
                } else {
                    calculate = year % 400;
                    return calculate == 0;
                }

            }
        }
    }
    public static int getDaysInMonth(int month, int year){
        if((month < 1) || (month > 12) || (year < 1) || (year > 9999)){
            return -1;
        } else {

        }
    }


}
