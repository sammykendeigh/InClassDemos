/**
 * This is IntegerUtilsTest.java, packaged within
 * edu.unl.raikes.day20.
 */
package edu.unl.raikes.day20;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * This class provides the definitions for IntegerUtilsTest in the edu.unl.raikes.day20 package.
 */
public class IntegerUtilsTest {

    private static double DELTA = .001;

    @Test
    public void testPowerWithNonNegativeBaseAndPower() {
        // F - function (see above)

        // S - Setup
        int expectedResult = 343;

        // E - Execute
        int actualResult = IntegerUtils.power(7, 3);

        // T - Test
        assertEquals("Did not cube 7 appropriately", expectedResult, actualResult);
    }

    @Test
    public void testPowerWithNegativeBaseAndPositivePower() {
        // F - function (see above)

        // S - Setup
        int expectedResult = -343;

        // E - Execute
        int actualResult = IntegerUtils.power(-7, 3);

        // T - Test
        assertEquals("Did not cube -7 appropriately", expectedResult, actualResult);
    }

    @Test
    public void testPowerWithPositiveDoubles() {
        // S
        double expectedResult = 1296.0;

        // E
        double actualResult = IntegerUtils.power(6.0, 4);

        // T
        assertTrue("Did not teserect 6 appropriately", Math.abs(expectedResult - actualResult) < DELTA);
    }
}
