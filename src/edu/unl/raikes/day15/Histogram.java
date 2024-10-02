package edu.unl.raikes.day15;

/**
 * This is Histogram.java, packaged within edu.unl.raikes.day15.
 */
public class Histogram {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String args[]) {
        int[] scores = { 87, 95, 63, 95, 99, 80, 86, 95, 87 };
        int[] tallies = new int[101]; // counters of test scores 0 - 100

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            tallies[score]++;
        }

        for (int i = 0; i < tallies.length; i++) {
            if (tallies[i] != 0) {
                System.out.print(i + ":  ");
                for (int tally = 0; tally < tallies[i]; tally++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
