package edu.unl.raikes.day10;

/**
 * This is AsteriskCounter.java, packaged within edu.unl.raikes.day10.
 */
public class AsteriskCounter {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        int numAsterisks = 0;

        for (int i = -2; i <= 13; i++) {
            System.out.print("*");
            System.out.println("**");

            numAsterisks += 3;
        }

        System.out.println(numAsterisks);
    }
}
