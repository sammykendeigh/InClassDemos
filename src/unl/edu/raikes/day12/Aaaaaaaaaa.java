package unl.edu.raikes.day12;

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
        int userNum = scnr.nextInt();

        String aaaaa = "";

        for (int row = 1; row <= userNum; row++) {
            for (int col = 1; col <= userNum; col++) {
                System.out.print(".");
            }
            System.out.println();
        }

        scnr.close();
    }

}
