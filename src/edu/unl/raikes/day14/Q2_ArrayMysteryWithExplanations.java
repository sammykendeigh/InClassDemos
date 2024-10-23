/**
 * This is Q2_ArrayMystery.java, packaged within
 * edu.unl.raikes.day14.
 */
package edu.unl.raikes.day14;

import java.util.Scanner;

/**
 * This class provides the definitions for Q2_ArrayMystery in the edu.unl.raikes.day14 package.
 */
public class Q2_ArrayMysteryWithExplanations {

    /**
     * This function ... TODO
     *
     * @param args
     */
    public static void main(String[] args) {
        // scanner to slow things down step by step
        Scanner scnr = new Scanner(System.in);

        int[] a = { 1, 7, 5, 6, 4, 14, 11 };
        for (int i = 0; i < a.length - 1; i++) {
            // log some helpful stuff
            System.out.println("I'm at index " + i + " and the value of a[" + i + "] is " + a[i]);
            System.out.print("    I'm going to compare if a[" + i + "] = " + a[i] + " is greater than the value at a["
                    + (i + 1) + "] = " + a[i + 1] + ". If it isn't greater, I'll do nothing.");
            scnr.nextLine();

            // actually calculate
            if (a[i] > a[i + 1]) {
                a[i + 1] = a[i + 1] * 2;

                // log some more stuff
                System.out.println("    a[" + i + "] was greater than its neighbor (a[" + (i + 1)
                        + "]), so I'll double the neighbor's value.");
                System.out.println("    The neighbor, a[" + (i + 1) + "], now has a value of " + a[i + 1]);
                scnr.nextLine();
            }
            System.out.println();
        }

        // print it out
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }

}
