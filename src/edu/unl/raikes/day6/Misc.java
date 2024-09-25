/**
 * This is Misc.java, packaged within
 * edu.unl.raikes.day6.
 */
package edu.unl.raikes.day6;

import java.util.Scanner;

/**
 * This class provides the definitions for Misc in the edu.unl.raikes.day6 package.
 */
public class Misc {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int input = scnr.nextInt();

        for (int i = 1; i <= input; i++) {
            System.out.print("*");
        }
    }

}
