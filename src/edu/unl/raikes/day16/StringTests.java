package edu.unl.raikes.day16;

import java.util.Arrays;

/**
 * This is StringTests.java, packaged within edu.unl.raikes.day16.
 */
public class StringTests {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        String[][] strTable = new String[5][4];
        strTable[2][3] = "raikes school";
        System.out.print(strTable.length + " ");
        System.out.print(strTable[0].length + " ");
        System.out.print(strTable[2][3].length());

        System.out.println(Arrays.deepToString(strTable));
    }
}
