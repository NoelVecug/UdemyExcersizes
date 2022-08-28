public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfTime){
        if(hourOfTime < 0 || hourOfTime > 23){
            return false;
        } else return barking && (hourOfTime < 8 || hourOfTime > 22);
    }
}
