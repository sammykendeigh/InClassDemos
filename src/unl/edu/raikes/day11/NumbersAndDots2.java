package unl.edu.raikes.day11;

/**
 * This is NumbersAndDots.java, packaged within unl.edu.raikes.day11.
 */
public class NumbersAndDots2 {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        for (int rows = 1; rows <= 5; rows++) {
            for (int j = 1; j <= (5 - rows); j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= rows; k++) {
                System.out.print(rows);
            }
            System.out.println();
        }

    }
}
