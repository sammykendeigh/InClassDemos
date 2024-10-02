package edu.unl.raikes.day15;

import java.util.Arrays;

/**
 * This is Tally.java, packaged within edu.unl.raikes.day15.
 */
public class Tally {


    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        int y = 2;
        int x = 0;
        int[] a = new int[3];
        mystery(a, y, x);                                              
        System.out.printf("x=%d, y=%d, a=%s\n",x,y,Arrays.toString(a));    
        x = y + 1;
        mystery(a, y, x);                                   
        System.out.printf("x=%d, y=%d, a=%s\n",x,y,Arrays.toString(a)); 
    }

    /**
     * Mystery.
     *
     * @param a the a
     * @param y the y
     * @param x the x
     */
    public static void mystery(int[] a, int y, int x) {
        if (x < y) {
            x++;
            a[x] = 15;
        } else {
            x--;
            a[y] = 34;
        }                  
        System.out.printf("x=%d, y=%d, a=%s\n",x,y,Arrays.toString(a)); 
    }

}
