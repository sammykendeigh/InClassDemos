package edu.unl.raikes.day14;

import java.util.Scanner;

public class AverageTemperatureWithArrays {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // get user input
        System.out.print("How many days' temperatures would you like to average? ");
        int days = scnr.nextInt();

        // initialize the variables for user input
        double[] dayTemperatures = new double[days];

        // this will keep a running total of the temperatures we've seen so far
        double totalOfTemperatures = 0;

        // get temperatures from user
        for (int day = 0; day < dayTemperatures.length; day++) {
            System.out.print("Day " + (day + 1) + "'s high temp? ");
            dayTemperatures[day] = scnr.nextDouble();
            totalOfTemperatures += dayTemperatures[day];
        }

        // calculate the average of all temperatures
        double averageTemperature = totalOfTemperatures / days;

        // we need to know how many days are above average
        int daysAboveAverage = 0;

        for (int day = 0; day < dayTemperatures.length; day++) {
            if (dayTemperatures[day] > averageTemperature) {
                daysAboveAverage++;
            }
        }

        // print out statistics to user
        System.out.println("Average temp = " + averageTemperature);
        System.out.println(daysAboveAverage + " days were above average.");

        // CLOSE THAT SCANNER! :-)
        scnr.close();
    }

}
