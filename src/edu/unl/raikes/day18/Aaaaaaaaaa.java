package edu.unl.raikes.day18;

import java.util.Scanner;

/**
 * This is Aaaaaaaaaa.java, packaged within unl.edu.raikes.day12.
 */
public class Aaaaaaaaaa {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // ask the user for the size
        System.out.print("please enter an int:");
        int size = scnr.nextInt();

        String stripeStartsWithA = "";
        String stripeStartsWithBlank = "";

        for (int row = 0; row < size; row++) {
            for (int trueCol = 0; trueCol < size * size; trueCol++) {
                int col = trueCol % size;
                int middle = (size - 1) / 2;
                int half = size / 2;
                int end = size - 1;
                int whichA = trueCol / size;
                boolean isCrossBar = row == middle;
                boolean isFirstLeg = col == 0 && row > middle;
                boolean isSecondLeg = col == end && row > middle;
                boolean isUpAngle = col == middle - row;
                boolean isDownAngle = col == half + row;
                boolean isPartOfA = isCrossBar || isFirstLeg || isSecondLeg || isUpAngle || isDownAngle;
                boolean isOddA = whichA % 2 == 1; // when the a is odd

                // for the stripe that starts with A
                if (isPartOfA && !isOddA) {
                    stripeStartsWithA += "X";
                } else {
                    stripeStartsWithA += ".";
                }

                // for the stripe that starts with a blank
                if (isPartOfA && isOddA) {
                    stripeStartsWithBlank += "X";
                } else {
                    stripeStartsWithBlank += ".";
                }
            }
            stripeStartsWithA += "\n";
            stripeStartsWithBlank += "\n";
        }

        System.out.print(stripeStartsWithA);
        System.out.print(stripeStartsWithBlank);
        System.out.print(stripeStartsWithA);
        System.out.print(stripeStartsWithBlank);
        System.out.print(stripeStartsWithA);
        System.out.print(stripeStartsWithBlank);
        System.out.print(stripeStartsWithA);
        System.out.print(stripeStartsWithBlank);
        System.out.print(stripeStartsWithA);
        System.out.print(stripeStartsWithBlank);
        System.out.print(stripeStartsWithA);
        System.out.print(stripeStartsWithBlank);
        System.out.print(stripeStartsWithA);

        scnr.close();
    }
}
