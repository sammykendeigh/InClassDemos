/**
 * This is Misc.java, packaged within
 * edu.unl.raikes.day6.
 */
package edu.unl.raikes.day06;

/**
 * This class provides the definitions for Misc in the edu.unl.raikes.day6 package.
 */
public class Misc {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        char demoChar = 409;
        System.out.println(demoChar + " " + (int) demoChar);

        demoChar = (char) (demoChar * -1);
        System.out.println(demoChar + " " + (int) demoChar);

        char h = 'h';
        h = (char) (h - 1);
        System.out.println(h + " " + (int) h);

        char b = 'b';
        char a = 'a';
        char c = (char) (a - b);
        System.out.println(c + " " + (int) c);

        System.out.println("a is " + (int) ('a'));
        System.out.println("A is " + (int) ('A'));

        int x = 83;
        String q = "hey " + (char) x + "hey";
        System.out.println(q);

        String racecar = "racecar";
        String book = racecar;
        book += " fast";
        System.out.println(racecar);
        System.out.println(book);

        int football = 7;
        int baseball = football;
        baseball += 4;
        System.out.println(football);
        System.out.println(baseball);

        String s1 = "Football";
        String s2 = s1.substring(4, 8);
        s2 = s2.substring(1);
        System.out.print(s2);
    }
}
