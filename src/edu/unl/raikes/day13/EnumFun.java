package edu.unl.raikes.day13;

/**
 * This is EnumFun.java, packaged within edu.unl.raikes.day13.
 */
public class EnumFun {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        TypeOfCheese myFaveCheese = TypeOfCheese.GOUDA;

        System.out.println(myFaveCheese); // GOUDA

        System.out.println(myFaveCheese.ordinal()); // 6

        System.out.println(TypeOfCheese.valueOf("muenster".toUpperCase())); // MUENSTER

        switch (myFaveCheese) {
            case PANEER:
                System.out.println("good choice");
                break;
            default:
                System.out.println("ummm.... okay i guess.");
        }
        // umm... okay i guess
    }

}
