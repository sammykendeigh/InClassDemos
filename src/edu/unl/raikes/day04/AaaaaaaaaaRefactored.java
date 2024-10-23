package edu.unl.raikes.day04;

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
        char[][] starGrid = getFilledInGrid(size, size, '.');

        // how many rows there are
        for (int row = 0; row < starGrid.length; row++) {
            // how many columns there are in this particular row
            for (int col = 0; col < starGrid[row].length; col++) {
                int middle = (size - 1) / 2;
                int half = size / 2;
                int end = size - 1;
                boolean isCrossBar = row == middle;
                boolean isFirstLeg = col == 0 && row > middle;
                boolean isSecondLeg = col == end && row > middle;
                boolean isUpAngle = col == middle - row;
                boolean isDownAngle = col == half + row;
                boolean isPartOfA = isCrossBar || isFirstLeg || isSecondLeg || isUpAngle || isDownAngle;

                // for the stripe that starts with A
                if (isPartOfA) {
                    starGrid[row][col] = 'X';
                }

            }

        }
        return starGrid;
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
        char[][] stripe = getFilledInGrid(starSize, starSize * 5, '@');

        // create a filled in char array
        char[][] nonStarGrid = getFilledInGrid(starSize, starSize, '.');

        // create star grid
        char[][] starGrid = getStarOfSize(starSize);

        for (int row = 0; row < stripe.length; row++) {
            for (int trueCol = 0; trueCol < stripe[row].length; trueCol++) {
                int col = trueCol % starSize;

                stripe[row][trueCol] = starGrid[row][col];
            }
        }
        return stripe;
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
        char[][] grid = new char[rows][cols];

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = fillChar;
            }
        }
        return grid; // give value back when it is called
    }

    /**
     * Prints each char in a char array to the console, with a newline between rows.
     *
     * @param charArray the array to be printed to the console
     */
    public static void printCharArray(char[][] charArray) {
        for (int row = 0; row < charArray.length; row++) {
            for (int col = 0; col < charArray[row].length; col++) {
                System.out.print(charArray[row][col]);
            }
            System.out.println();
        }

        // do not need to return anything since its a void type
    }

    /**
     * Given a size, constructs and prints a flag scaled to that size.
     *
     * @param size The length/width of a single star within the flag. The whole flag is scaled according to this size.
     */
    public static void printFlagOfSize(int size) {
        // create a filled-in char array
        char[][] nonStarGrid = getFilledInGrid(size, size, '.');

        printCharArray(nonStarGrid);

        char[][] starGrid = getStarOfSize(size);

        printCharArray(starGrid);
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

        printFlagOfSize(size);

//        String stripeStartsWithA = "";
//        String stripeStartsWithBlank = "";
//        String borderRow = "+";
//
//        for (int row = 0; row < size; row++) {
//            stripeStartsWithA += "|";
//            stripeStartsWithBlank += "|";
//            borderRow = "+";
//            for (int trueCol = 0; trueCol < size * size; trueCol++) {
//                int col = trueCol % size;
//                int middle = (size - 1) / 2;
//                int half = size / 2;
//                int end = size - 1;
//                int whichA = trueCol / size;
//                boolean isCrossBar = row == middle;
//                boolean isFirstLeg = col == 0 && row > middle;
//                boolean isSecondLeg = col == end && row > middle;
//                boolean isUpAngle = col == middle - row;
//                boolean isDownAngle = col == half + row;
//                boolean isPartOfA = isCrossBar || isFirstLeg || isSecondLeg || isUpAngle || isDownAngle;
//                boolean isOddA = whichA % 2 == 1; // when the a is odd
//
//                // for the stripe that starts with A
//                if (isPartOfA && !isOddA) {
//                    stripeStartsWithA += "X";
//                } else {
//                    stripeStartsWithA += ".";
//                }
//
//                // for the stripe that starts with a blank
//                if (isPartOfA && isOddA) {
//                    stripeStartsWithBlank += "X";
//                } else {
//                    stripeStartsWithBlank += ".";
//                }
//
//                borderRow += "-";
//            }
//            stripeStartsWithA += "|\n";
//            stripeStartsWithBlank += "|\n";
//        }
//
//        borderRow += "+";

//        System.out.println(borderRow);
//        System.out.print(stripeStartsWithA);
//        System.out.print(stripeStartsWithBlank);
//        System.out.print(stripeStartsWithA);
//        System.out.print(stripeStartsWithBlank);
//        System.out.print(stripeStartsWithA);
//        System.out.print(stripeStartsWithBlank);
//        System.out.print(stripeStartsWithA);
//        System.out.print(stripeStartsWithBlank);
//        System.out.print(stripeStartsWithA);
//        System.out.print(stripeStartsWithBlank);
//        System.out.print(stripeStartsWithA);
//        System.out.print(stripeStartsWithBlank);
//        System.out.print(stripeStartsWithA);
//        System.out.println(borderRow);

        scnr.close();
    }
}
