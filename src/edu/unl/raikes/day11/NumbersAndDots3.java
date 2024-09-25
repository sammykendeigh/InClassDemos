package edu.unl.raikes.day11;

import java.util.Scanner;

/**
 * This is NumbersAndDots.java, packaged within unl.edu.raikes.day11.
 */
public class NumbersAndDots3 {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("please enter an int:");
        int userNum = scnr.nextInt();

        for (int rows = 1; rows <= userNum; rows++) {
            for (int cols = 1; cols <= userNum; cols++) {
                boolean specialCase = rows == userNum - cols + 1;

                if (specialCase) {
                    System.out.print(rows);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        scnr.close();
    }
}
