public class NumberToWords {
    public static void numberToWords(int number){
        int countCheck = 0;
        int count = getDigitCount(number);


        number = reverse(number);
        if (number < 0){
            System.out.println("Invalid Value");
        }
        while (number > 0){
            int remain = number % 10;
            countCheck++;
            number /= 10;
            switch (remain){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        while (count > countCheck){
            System.out.println("Zero");
            countCheck++;
        }
    }
    public static int reverse(int number){
        int check = 0;
        if (number > 0){
            while (number > 0){
                int remain = number % 10;
                check *= 10;
                check += remain;
                number /= 10;
            } return check;
        } else if( number < 0){
            while (number < 0){
                int remain = number % 10;
                check *= 10;
                check += remain;
                number /= 10;
            } return check;
        } else {
            return 0;}
    }
    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            int check = 0;
            while (number > 0){
                check++;
                number /= 10;
            }return check;
        }
    }
}
