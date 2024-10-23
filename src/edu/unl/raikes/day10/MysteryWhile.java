package edu.unl.raikes.day10;

public class MysteryWhile {

    public static void main(String[] args) {
        int limit = 60;
        int val = 1;

        while (val < limit) {
            System.out.println(val);
            val *= 2;
        }
        System.out.println(val);
    }

}
