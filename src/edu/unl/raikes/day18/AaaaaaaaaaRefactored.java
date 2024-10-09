package edu.unl.raikes.day18;

import java.util.Scanner;

/**
 * This is Aaaaaaaaaa.java, packaged within unl.edu.raikes.day12.
 */
public class AaaaaaaaaaRefactored {

    /**
     * Creates and returns a char array representing a single star.
     *
     * @param  size the number of characters that comprise the width/height of the star
     * @return      a char array representing a single star
     */
    public static char[][] getStarOfSize(int size) {
        // TODO Fill in this function!
        return null;
    }

    /**
     * Constructs a stripe of the flag that contains stars. The stripes with an even number of stars have a stripe-color
     * of red, the stripes with an odd number of stars have a stripe color of white.
     *
     * @param  starSize the number of chars that comprise the width/height of a star
     * @param  even     determines whether the number of stars in this row is even or odd, also controls the stripe
     *                  color
     * @return          a char array representing the entire stripe: stars on the left and solid on the right
     */
    public static char[][] getStarStripe(int starSize, boolean even) {
        // TODO Fill in this function!
        return null;
    }

    /**
     * Creates and returns a 2D char array initialized with a specific character.
     *
     * @param  rows     the number of rows in the requested array
     * @param  cols     the number of columns in the requested
     * @param  fillChar the character to be stored in every cell of the array
     * @return          a char array of dimensions rows x cols initialized with fillChar in every cell
     */
    public static char[][] getFilledInGrid(int rows, int cols, char fillChar) {
        // TODO Fill in this function!
        return null;
    }

    /**
     * Prints each char in a char array to the console, with a newline between rows.
     *
     * @param charArray the array to be printed to the console
     */
    public static void printCharArray(char[][] charArray) {
        // TODO Fill in this function!
    }

    /**
     * Given a size, constructs and prints a flag scaled to that size.
     *
     * @param size The length/width of a single star within the flag. The whole flag is scaled according to this size.
     */
    public static void printFlagOfSize(int size) {
        // TODO Fill in this function!
    }

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
        String borderRow = "+";

        for (int row = 0; row < size; row++) {
            stripeStartsWithA += "|";
            stripeStartsWithBlank += "|";
            borderRow = "+";
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

                borderRow += "-";
            }
            stripeStartsWithA += "|\n";
            stripeStartsWithBlank += "|\n";
        }

        borderRow += "+";

        System.out.println(borderRow);
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
        System.out.println(borderRow);

        scnr.close();
    }
}
