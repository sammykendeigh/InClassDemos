package edu.unl.raikes.day10;

import java.util.Scanner;

/**
 * This is SquareDancing.java, packaged within edu.unl.raikes.day10.
 */
public class SquareDancing {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        for (int i = 1; i <= 6; i++) {
            System.out.print("i is: " + i + "   squared: " + (i * i));
            scnr.nextLine();
        }
        System.out.println("Whoop!");

        // System.out.println("i is: " + i);

        scnr.close();
    }

}
