public class DiagonalStar {
    public static void printSquareStar (int number){
        if (number < 5){
            System.out.println("Invalid Value");
        }
        char star = '*';
        for (int row = 0; row < number; row++){
            for (int column = 0; column < number; column++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
    private static boolean checkStatement(int number){
        int row = 0;
        int column = 0;
        return (((row = 1) || (row == number) || (column == 1) || (column == number)))
    }
}
