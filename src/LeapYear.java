public class LeapYear {

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        } else {
            int calculate = year % 4;
            if(calculate != 0){
                return false;
            } else {
                calculate = year % 100;
                if(calculate != 0){
                    return true;
                } else {
                    calculate = year % 400;
                    return calculate == 0;
                }

            }

        }
    }
}
