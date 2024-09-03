package edu.unl.raikes.day3;

import java.util.Scanner;

/**
 * This is CandyCorn.java, packaged within edu.unl.raikes.day3.
 */
public class CandyCorn {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numBagsDesired; // Number of bags of candy corn user will eat
        int numBagsPurchased; // Number of bags of candy corn user has purchased
        int numBagsNeeded; // Number of bags of candy corn user needs to purchase

        System.out.print("How many bags of candy corn do you want to eat this year? ");
        numBagsDesired = scnr.nextInt();

        System.out.print("How many bags of candy corn have you already purchased? ");
        numBagsPurchased = scnr.nextInt();
        numBagsNeeded = numBagsDesired - numBagsPurchased;
        System.out.println("You need to purchase " + numBagsNeeded + " more bags of candy corn.");

        scnr.close();
    }
}
