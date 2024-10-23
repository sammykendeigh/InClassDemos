package edu.unl.raikes.day11;

import java.util.Scanner;

/**
 * This is LoopPractice.java, packaged within unl.edu.raikes.day11.
 */
public class Example1 {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            scnr.nextLine();
            System.out.println(); // to end the line
        }
    }
}
