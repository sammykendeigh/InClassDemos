package edu.unl.raikes.day15;

import java.util.Arrays;

/**
 * This is ArrayReversal.java, packaged within edu.unl.raikes.day15.
 */
public class ArrayReversal {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        int[] goats = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(Arrays.toString(goats));

        for (int i = 0; i < goats.length / 2; i++) {
            int oppositeI = goats.length - i - 1;

            int temp = goats[i];
            goats[i] = goats[oppositeI];
            goats[oppositeI] = temp;
        }

        System.out.println(Arrays.toString(goats));
    }

}
