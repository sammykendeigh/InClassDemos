package edu.unl.raikes.day10;

import java.util.Scanner;

/**
 * This is WhileLessThan14.java, packaged within edu.unl.raikes.day10.
 */
public class WhileLessThan14 {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Please enter a number.");
        int num = scnr.nextInt(); // initialization

        while (num <= 14) { // test
            System.out.println(num + " isn’t less than 14");
            num = num * 2; // update
        }

        System.out.println("num is " + num + " now.");

        scnr.close();
    }

}
