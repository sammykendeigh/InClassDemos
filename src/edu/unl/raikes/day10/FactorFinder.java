package edu.unl.raikes.day10;

import java.util.Scanner;

/**
 * This is FactorFinder.java, packaged within edu.unl.raikes.day10.
 */
public class FactorFinder {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // get a value from the user
        System.out.print("Enter a number: ");
        int n = scnr.nextInt();

        // start at two
        int factor = 2;

        // increment until n can evenly divide by the factor
        while (n % factor != 0) {
            // increase factor so we can try again
            System.out.println(factor + " doesn't divide " + n + " evenly.");
            factor++;
        }

        System.out.println("First factor is " + factor);

        scnr.close();
    }

}
