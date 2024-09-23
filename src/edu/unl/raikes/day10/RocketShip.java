package edu.unl.raikes.day10;

/**
 * This is RocketShip.java, packaged within edu.unl.raikes.day10.
 */
public class RocketShip {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        System.out.print("T-minus ");

        // count down
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + ", ");
        }

        // finished!
        System.out.println("blastoff!");
        System.out.println("The end.");
    }

}
