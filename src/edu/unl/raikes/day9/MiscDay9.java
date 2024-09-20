package edu.unl.raikes.day9;

import java.util.Scanner;

/**
 * This class contains a game that allows users to play MadLibs.
 */
public class MiscDay9 {

    /**
     * This will hold the cool questions we answer in class.
     *
     * @param args This program does not use any arguments.
     */
    public static void main(String[] args) {
        System.out.print("How many applications will we submit? ");

        Scanner scnr = new Scanner(System.in);
        int apps = scnr.nextInt();
        scnr.nextLine();

        if (apps < 40) {
            System.out.println("Disappointed Steve.");
        } else if (apps >= 40 && apps < 100) {
            System.out.println("Unimpressed Steve.");
        } else if (apps >= 100 && apps < 200) {
            System.out.println("Satisfied Steve.");
        } else {
            System.out.println("Exhuberant (and nonjudgemental about spelling) Steve.");
        }

        double pickles = 1283745.6668;
        double manipuPickles = pickles;

        manipuPickles = Math.pow(Math.sqrt(manipuPickles), 2);

        System.out.println(pickles);
        System.out.println(manipuPickles);

        if (Math.abs(manipuPickles - pickles) < .001) {
            System.out.println("hooray");
        }

        String team = "Huskers";
        String myTeam = scnr.nextLine();

        if (team == myTeam) {
            System.out.println("The same!");
        }

        System.out.println("hooray");
    }
}
