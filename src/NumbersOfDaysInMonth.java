public class NumbersOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if((year < 1) || (year > 9999)){
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
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        } else {
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
                case 4: case 6: case 9: case 11: return 30;
                case 2: return (isLeapYear(year)) ? 29 : 28;
            }
        } return -1;

    }


}
