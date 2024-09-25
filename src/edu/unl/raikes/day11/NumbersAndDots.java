package edu.unl.raikes.day11;

/**
 * This is NumbersAndDots.java, packaged within unl.edu.raikes.day11.
 */
public class NumbersAndDots {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        for (int rows = 1; rows <= 5; rows++) {
            for (int cols = 5; cols > rows; cols--) {
                System.out.print(".");
            }
            System.out.println(rows);
        }
    }
}
