package edu.unl.raikes.day14;

import java.util.Scanner;

public class AverageTemperature {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // get user input
        System.out.print("How many days' temperatures would you like to average? ");
        int days = scnr.nextInt();

        // initialize the variables for user input
        double day1Temperature = 0;
        double day2Temperature = 0;
        double day3Temperature = 0;
        double day4Temperature = 0;
        double day5Temperature = 0;
        double day6Temperature = 0;
        double day7Temperature = 0;
        double day8Temperature = 0;
        double day9Temperature = 0;
        double day10Temperature = 0;
        double day11Temperature = 0;
        double day12Temperature = 0;
        double day13Temperature = 0;
        double day14Temperature = 0;
        double day15Temperature = 0;

        // this will keep a running total of the temperatures we've seen so far
        double totalOfTemperatures = 0;

        // get temperatures from user (fingers crossed they don't want more than 15!)
        if (days <= 1) {
            System.out.print("Day 1's high temp? ");
            day1Temperature = scnr.nextDouble();
            totalOfTemperatures += day1Temperature;
        }

        if (days <= 2) {
            System.out.print("Day 2's high temp? ");
            day2Temperature = scnr.nextDouble();
            totalOfTemperatures += day2Temperature;
        }

        if (days <= 3) {
            System.out.print("Day 3's high temp? ");
            day3Temperature = scnr.nextDouble();
            totalOfTemperatures += day3Temperature;
        }

        if (days <= 4) {
            System.out.print("Day 4's high temp? ");
            day4Temperature = scnr.nextDouble();
            totalOfTemperatures += day4Temperature;
        }

        if (days <= 5) {
            System.out.print("Day 5's high temp? ");
            day5Temperature = scnr.nextDouble();
            totalOfTemperatures += day5Temperature;
        }

        if (days <= 6) {
            System.out.print("Day 6's high temp? ");
            day6Temperature = scnr.nextDouble();
            totalOfTemperatures += day6Temperature;
        }

        if (days <= 7) {
            System.out.print("Day 7's high temp? ");
            day7Temperature = scnr.nextDouble();
            totalOfTemperatures += day7Temperature;
        }

        if (days <= 8) {
            System.out.print("Day 8's high temp? ");
            day8Temperature = scnr.nextDouble();
            totalOfTemperatures += day7Temperature;
        }

        if (days <= 9) {
            System.out.print("Day 9's high temp? ");
            day9Temperature = scnr.nextDouble();
            totalOfTemperatures += day9Temperature;
        }

        if (days <= 10) {
            System.out.print("Day 10's high temp? ");
            day10Temperature = scnr.nextDouble();
            totalOfTemperatures += day10Temperature;
        }

        if (days <= 11) {
            System.out.print("Day 11's high temp? ");
            day11Temperature = scnr.nextDouble();
            totalOfTemperatures += day11Temperature;
        }

        if (days <= 12) {
            System.out.print("Day 12's high temp? ");
            day12Temperature = scnr.nextDouble();
            totalOfTemperatures += day12Temperature;
        }

        if (days <= 13) {
            System.out.print("Day 13's high temp? ");
            day13Temperature = scnr.nextDouble();
            totalOfTemperatures += day13Temperature;
        }

        if (days <= 14) {
            System.out.print("Day 14's high temp? ");
            day14Temperature = scnr.nextDouble();
            totalOfTemperatures += day14Temperature;
        }

        if (days <= 15) {
            System.out.print("Day 15's high temp? ");
            day15Temperature = scnr.nextDouble();
            totalOfTemperatures += day15Temperature;
        }

        // calculate the average of all temperatures
        double averageTemperature = totalOfTemperatures / days;

        // we need to know how many days are above average
        int daysAboveAverage = 0;

        if (day1Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day2Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day3Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day4Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day5Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day6Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day7Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day8Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day9Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day10Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day11Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day12Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day13Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day14Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        if (day15Temperature > averageTemperature) {
            daysAboveAverage++;
        }

        // print out statistics to user
        System.out.println("Average temp = " + averageTemperature);
        System.out.println(daysAboveAverage + "days were above average.");

        // CLOSE THAT SCANNER! :-)
        scnr.close();
    }

}
