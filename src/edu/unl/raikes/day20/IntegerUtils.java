package edu.unl.raikes.day20;

/**
 * This is IntegerUtils.java, packaged within edu.unl.raikes.day19.copy.
 */
public class IntegerUtils {
    /**
     * Raises a provided base integer to a provided (whole) power. Returns a double in case of integer overload.
     * 
     * @param  base  The integer that you want to raise to a power
     * @param  power The exponent of the equation; the number of times to multiply the base with itself
     * @return       a double representing the "base" integer multiplied by itself "power" times
     */
    public static double power(int base, int power) {
        double result = 1;
        for (int i = 1; i < power; i++) {
            result *= power;
        }
        return result;
    }
}
