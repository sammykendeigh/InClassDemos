/**
 * This is Q2_ArrayMystery.java, packaged within
 * edu.unl.raikes.day14.
 */
package edu.unl.raikes.day14;

import java.util.Arrays;

/**
 * This class provides the definitions for Q2_ArrayMystery in the edu.unl.raikes.day14 package.
 */
public class Q2_ArrayMystery {

    /**
     * This function ... TODO
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] a = { 1, 7, 5, 6, 4, 14, 11 };
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                a[i + 1] = a[i + 1] * 2;
            }
        }

        // print it out
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.binarySearch(a, 14));
    }

}
