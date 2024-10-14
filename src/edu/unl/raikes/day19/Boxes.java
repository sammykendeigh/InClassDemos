package edu.unl.raikes.day19;

public class Boxes {

    public static String repeat(String piece, int numRepeats) {
        String megaString = "";

        for (int i = 0; i < numRepeats; i++) {
            megaString += piece;
        }

        return megaString;
    }

    public static String middleOfBox(String piece, int numRepeats) {
        String megaString = "";

        megaString += piece;
        megaString += repeat(" ", (numRepeats - 2) * piece.length());
        megaString += piece;

        return megaString;
    }

    public static String boxify(String piece, int size) {
        String megaString = "";

        // top of box
        megaString += repeat(piece, size) + "\n";

        for (int i = 0; i < size - 2; i++) {
            megaString += middleOfBox(piece, size) + "\n";
        }

        // bottom of box
        megaString += repeat(piece, size);

        return megaString;
    }

    public static void main(String[] args) {
        System.out.println(repeat("woo", 8));

        System.out.println(repeat("*", 7));

        System.out.println(repeat("Q", 27));

        System.out.println(boxify("happy", 4));

        System.out.println(boxify("s", 5));
    }

}
