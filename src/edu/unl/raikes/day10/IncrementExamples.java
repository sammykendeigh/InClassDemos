package edu.unl.raikes.day10;

/**
 * This class explores the concept of incrementing/decrementing.
 */
public class IncrementExamples {

    /**
     * This will hold some examples of incrementing/decrementing.
     *
     * @param args This program does not use any arguments.
     */
    public static void main(String[] args) {
        int mints = 7;
        System.out.println("before: " + mints + " when decremented: " + mints-- + " after: " + mints);

        mints = 7;
        System.out.println("before: " + mints + " when decremented: " + --mints + " after: " + mints);
    }
}
