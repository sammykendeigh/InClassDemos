package edu.unl.raikes.day11;

/**
 * This is LoopPractice.java, packaged within unl.edu.raikes.day11.
 */
public class CalculatingTotals {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
