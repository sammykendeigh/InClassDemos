package edu.unl.raikes.day18;

/**
 * This is BakeCookies3.java, packaged within edu.unl.raikes.day17.
 */
public class BakeCookies3 {

    public static void makeTheCookieBatter() {
        System.out.println("Mix the dry ingredients.");
        System.out.println("Cream the butter and sugar.");
        System.out.println("Beat in the eggs.");
        System.out.println("Stir in the dry ingredients.");
    }

    public static void bakeOneBatchOfCookies() {
        System.out.println("Set the oven temperature.");
        System.out.println("Set the timer.");
        System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake.");

    }

    public static void decorateCookies() {
        System.out.println("Mix ingredients for frosting.");
        System.out.println("Spread frosting and sprinkles.");
    }

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        // Step 1: Make the cookie batter.
        makeTheCookieBatter();

        // Step 2a: Bake cookies (first batch).
        bakeOneBatchOfCookies();

        // Step 2b: Bake cookies (second batch).
        bakeOneBatchOfCookies();

        // Step 3: Decorate the cookies.
        decorateCookies();
    }
}
