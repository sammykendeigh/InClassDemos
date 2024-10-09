package edu.unl.raikes.day18;

/**
 * This is MethodCalls.java, packaged within edu.unl.raikes.day17.
 */
public class MethodCalls {
	
	/**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
	public static void main(String args[]) {
		a();
		b();
		c();
		c();
	}
	
	/**
     * A.
     */
	public static void a() {
		System.out.println("A");
	}
	
	/**
     * B.
     */
	public static void b() {
		System.out.println("B");
		a();
		System.out.println("B");
	}
	
	/**
     * C.
     */
	public static void c() {
		a();
		b();
		System.out.println("C");
		b();
	}
}
