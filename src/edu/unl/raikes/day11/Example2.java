package edu.unl.raikes.day11;

/**
 * This is LoopPractice.java, packaged within unl.edu.raikes.day11.
 */
public class Example2 {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
