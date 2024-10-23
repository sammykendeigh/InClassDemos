/**
 * This is InputValidationTest.java, packaged within
 * edu.unl.raikes.inputValidation.
 */
package edu.unl.raikes.inputValidation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

public class InputValidationTest {
    // Test case for canParseInt (valid input)
    @Test
    public void testCanParseIntHappyPath() {
        // Execute
        boolean result = InputValidation.canParseInt("123");

        // Test: Assert that result is true
        assertTrue(result);
    }

    // Test case for canParseInt (invalid input)
    @Test
    public void testCanParseIntInvalid() {
        // Execute
        boolean result = InputValidation.canParseInt("abc");

        // Test: Assert that result is false
        assertFalse(result);
    }

    // Test case for canParseInt (negative number)
    @Test
    public void testCanParseIntNegativeNumber() {
        // Execute
        boolean result = InputValidation.canParseInt("-456");

        // Test: Assert that result is true
        assertTrue(result);
    }

    // Test case for queryInt (valid input)
    @Test
    public void testQueryIntHappyPath() {
        // Setup: Provide a valid integer in the scanner
        Scanner scanner = new Scanner("123");

        // Execute: Call the method to test
        int result = InputValidation.queryInt(scanner, "Enter an integer:", "Invalid input");

        // Test: Assert that result equals 123
        assertEquals(123, result);

        scanner.close();
    }

    // Test case for queryInt (invalid followed by valid input)
    @Test
    public void testQueryIntWithReprompt() {
        // Setup: First input is invalid, then valid
        Scanner scanner = new Scanner("abc\n789");

        // Execute: Call the method to test
        int result = InputValidation.queryInt(scanner, "Enter an integer:", "Invalid input");

        // Test: Assert that result equals 789
        assertEquals(789, result);

        scanner.close();
    }

    // Test case for queryChar (valid input)
    @Test
    public void testQueryCharHappyPath() {
        // Setup: Provide a valid char in the scanner
        Scanner scanner = new Scanner("a");

        // Execute: Call the method to test
        char result = InputValidation.queryChar(scanner, "Enter a character:", "Invalid input");

        // Test: Assert that result equals 'a'
        assertEquals('a', result);

        scanner.close();
    }

    // Test case for queryChar (invalid char followed by valid input)
    @Test
    public void testQueryCharWithReprompt() {
        // Setup: First input is invalid (a number), then valid (a char)
        Scanner scanner = new Scanner("1\nb");

        // Execute: Call the method to test
        char result = InputValidation.queryChar(scanner, "Enter a character:", "Invalid input");

        // Test: Assert that result equals 'b'
        assertEquals('b', result);

        scanner.close();
    }

    // Test case for canParseChar (valid char)
    @Test
    public void testCanParseCharHappyPath() {
        // Execute: Call the method to test
        boolean result = InputValidation.canParseChar("x");

        // Test: Assert that result is true
        assertTrue(result);
    }

    // Test case for canParseChar (invalid char - number)
    @Test
    public void testCanParseCharInvalid() {
        // Execute: Call the method to test
        boolean result = InputValidation.canParseChar("1");

        // Test: Assert that result is false
        assertFalse(result);
    }

    // Test case for canParseDouble (valid input)
    @Test
    public void testCanParseDoubleHappyPath() {
        // Execute
        boolean result = InputValidation.canParseDouble("123.45");

        // Test: Assert that result is true
        assertTrue(result);
    }

    // Test case for canParseDouble (invalid input)
    @Test
    public void testCanParseDoubleInvalid() {
        // Execute
        boolean result = InputValidation.canParseDouble("abc");

        // Test: Assert that result is false
        assertFalse(result);
    }

    // Test case for queryDouble (valid input)
    @Test
    public void testQueryDoubleHappyPath() {
        // Setup: Provide a valid double in the scanner
        Scanner scanner = new Scanner("123.45");

        // Execute: Call the method to test
        double result = InputValidation.queryDouble(scanner, "Enter a double:", "Invalid input");

        // Test: Assert that result equals 123.45
        assertEquals(123.45, result, 0.001);

        scanner.close();
    }

    // Test case for queryDouble (invalid followed by valid input)
    @Test
    public void testQueryDoubleWithReprompt() {
        // Setup: First input is invalid, then valid
        Scanner scanner = new Scanner("abc\n456.78");

        // Execute: Call the method to test
        double result = InputValidation.queryDouble(scanner, "Enter a double:", "Invalid input");

        // Test: Assert that result equals 456.78
        assertEquals(456.78, result, 0.001);

        scanner.close();
    }
}
