package edu.unl.raikes.day03;

/**
 * This is FunQuestions.java, packaged within edu.unl.raikes.day3.
 */
public class FunQuestions {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
//		char rabbit = 218;
//
//		System.out.println(rabbit);
//		System.out.println((int)rabbit);

        double originalPenguin = 4.368295847363748593994857783098435248592048023984029384203958230598;
        System.out.println("4.368295847363748593994857783098435248592048023984029384203958230598");
        System.out.println(originalPenguin);

        // make some calculations that shouldn't change
        // penguin's value (get the square root, then square it)
        double penguin = Math.sqrt(originalPenguin);
        penguin = Math.pow(penguin, 2);
        System.out.println(penguin);

        // is the original value still the same as the new one?
        System.out.println(originalPenguin == penguin);
    }
}
