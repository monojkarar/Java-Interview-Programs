package com.mac.java.simple.problem;

/**
 * Find the maximum number from the group of numbers.  
 * 
 * @author monojkarar
 *
 */

public class LargestNumber {

	public static void main(String[] args) {

		int a = 30, b = 5, c = 15;
		System.out.println(a > b ? a > c ? a : c : b > c ? b : c);

		int big = a;

		if (b > big) {
			big = b;
		}
		if (c > big) {
			big = c;
		}
		System.out.println(big);
	}

}
