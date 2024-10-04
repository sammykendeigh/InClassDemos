
package edu.unl.raikes.day16;

import java.util.Scanner;

/**
 * This is BabyGrowthChart.java, packaged within edu.unl.raikes.day16.
 */
public class BabyGrowthChart {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // accumulator variables
        double allTimeGrowth = 0;
        double largestSpurt = 0;

        int[][] a = { { 2, 3, 4 }, { 2, 3 } };

        // get bounds for our 2d array
        System.out.print("How many days of measurements do you have to analyze? ");
        final int DAYS_OF_MEASUREMENTS = scnr.nextInt();
        final int NUM_LENGTHS_PER_DAY = 3;

        // what should our array initialization look like?

        // how do we average the lengths? Share it with the user!

        // how can we calculate the growth from the previous day? Share it with the user!

        // how can we calculate the growth over all time? Share it with the user!

        // how can we print the values so we can see them?

        System.out.printf("Since the first measurements, this baby has grown %.2f inches.\n", allTimeGrowth);
        System.out.printf("This baby's largest growth spurt was %.2f inches.", largestSpurt);
        scnr.close();
    }
}
