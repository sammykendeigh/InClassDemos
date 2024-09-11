/**
 * This is PrintFormatting.java, packaged within
 * edu.unl.raikes.day7.
 */
package edu.unl.raikes.day7;

/**
 * This class provides the definitions for PrintFormatting in the edu.unl.raikes.day7 package.
 */
public class WordExtraction {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        String book = "Harry Potter and the Sorcerer's Stone";

        int firstSpace = book.indexOf(" ");
        System.out.println(firstSpace);

        // first way
        String afterFirstWord = book.substring(firstSpace + 1);
        System.out.println(afterFirstWord);

        int secondSpace = afterFirstWord.indexOf(" ");
        System.out.println(afterFirstWord.substring(0, secondSpace));

        // differentWay
        int findSecondSpaceRightAway = book.indexOf(" ", firstSpace + 1);
        System.out.println(book.substring(firstSpace + 1, findSecondSpaceRightAway));

        System.out.println((secondSpace + firstSpace + 1) + " =? " + findSecondSpaceRightAway);
    }

}
