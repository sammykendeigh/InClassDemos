/**
 * This is PrintFormatting.java, packaged within
 * edu.unl.raikes.day7.
 */
package edu.unl.raikes.day7;

/**
 * This class provides the definitions for PrintFormatting in the edu.unl.raikes.day7 package.
 */
public class PrintFormatting {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        int n = 461012;
        System.out.printf("%d\n", n); // --> "461012"
        System.out.printf("%08d\n", n); // --> "00461012"
        System.out.printf("%+8d\n", n); // --> " +461012"
        System.out.printf("%,8d\n", n); // --> " 461,012"
        System.out.printf("%+,8d\n", -n);

        double pi = Math.PI;
        System.out.printf("%f\n", pi); // --> "3.141593"
        System.out.printf("%.3f\n", pi); // --> "3.142"
        System.out.printf("%10.3f\n", pi); // --> " 3.142"
        System.out.printf("%-10.3f\n", pi); // --> "3.142 "
    }

}
