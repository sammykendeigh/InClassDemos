package edu.unl.raikes.day10;

/**
 * This is WiggleBox.java, packaged within edu.unl.raikes.day10.
 */
public class WiggleBox {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        // add the top of the box
        System.out.println("+----+");

        // add the wiggles
        for (int i = 1; i <= 3; i++) {
            System.out.println("\\    /");
            System.out.println("/    \\");
        }

        // add the bottom of the box
        System.out.println("+----+");
    }

}
