
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

        // get bounds for our 2d array
        System.out.print("How many days of measurements do you have to analyze? ");
        final int DAYS_OF_MEASUREMENTS = scnr.nextInt();
        final int NUM_LENGTHS_PER_DAY = 3;

        // what should our array initialization look like?
        int[][] lengths = new int[DAYS_OF_MEASUREMENTS][NUM_LENGTHS_PER_DAY];
        int[] averageLengths = new int[DAYS_OF_MEASUREMENTS];

        // how do we get the lengths from the user?
        for (int row = 0; row < lengths.length; row++) {
            averageLengths[row] = 0;

            System.out.println("Now we're talking about day " + (row + 1));
            for (int col = 0; col < lengths[row].length; col++) {
                System.out.print("    Measurement " + (col + 1) + ": ");
                lengths[row][col] = scnr.nextInt();
                averageLengths[row] += lengths[row][col];
            }

            // divide average by the number measurements taken
            averageLengths[row] = averageLengths[row] / lengths[row].length;
            System.out.println("    Average Measurement: " + averageLengths[row]);

            // see if this day is growth from prev day
            if (row > 0 && averageLengths[row] > averageLengths[row - 1]) {
                allTimeGrowth += averageLengths[row] - averageLengths[row - 1];
            }
        }

        // how can we calculate the growth from the previous day? Share it with the user!

        // how can we calculate the growth over all time? Share it with the user!

        // how can we print the values so we can see them?
        for (int row = 0; row < lengths.length; row++) {
            for (int col = 0; col < lengths[row].length; col++) {
                System.out.print(lengths[row][col] + "   ");
            }
            System.out.println();
        }

        System.out.printf("Since the first measurements, this baby has grown %.2f inches.\n", allTimeGrowth);
        System.out.printf("This baby's largest growth spurt was %.2f inches.", largestSpurt);
        scnr.close();
    }
}
