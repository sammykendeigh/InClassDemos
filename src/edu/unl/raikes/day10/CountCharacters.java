package edu.unl.raikes.day10;

import java.util.Scanner;

/**
 * This class provides the definitions for CountCharacters in the edu.unl.raikes.day10 package.
 */
public class CountCharacters {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numChars = 0;

        final String SENTINAL = "bananas";
        final String PROMPT = "Type a line (or '" + SENTINAL + "' to exit): ";

        // add a post
        System.out.println(PROMPT);
        String input = scnr.nextLine();

        // loop until input is the empty string
        while (!input.equals(SENTINAL)) {
            // add some wire - count the chars
            numChars += input.length();

            // add a post - get user input
            System.out.println(PROMPT);
            input = scnr.nextLine();
        }

        System.out.println("You typed a total of " + numChars + " characters.");

        scnr.close();
    }
}
