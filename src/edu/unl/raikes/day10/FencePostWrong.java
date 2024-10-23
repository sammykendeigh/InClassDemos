package edu.unl.raikes.day10;

/**
 * This is FencePostWrong.java, packaged within edu.unl.raikes.day10.
 */
public class FencePostWrong {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        int max = 5;

        // attempt 1: add a comma after each value
        for (int i = 1; i <= max; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(); // to end the line of output

        System.out.println("----------------");

        // attempt 2: maybe we need to add a comma before each value?
        for (int i = 1; i <= max; i++) {
            System.out.print(", " + i);
        }
        System.out.println(); // to end the line of output

        System.out.println("----------------");

        // attempt 3: fencepost
        for (int i = 1; i <= max - 1; i++) {
            // add a fencepost (the value of i) and the wire (the comma)
            System.out.print(i + ", ");
        }
        System.out.println(max); // add the last fencepost and end the line
    }

}
