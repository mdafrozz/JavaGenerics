/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author MD_AFROZ
 *
 */
class MaximumTest {

	public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
		System.out.println("The numbers are : " + a + ","
				+ b + "," + c);
		T max = a;
		if (max.compareTo(b) < 0) {
			max = b;
		}
		if (max.compareTo(c) < 0) {
			max = c;
		}
		return max;
	}
	
	public static void main(String args[]) {
		
		int a = 10;
		Integer b = 20, c = 30;
		System.out.println("Maximum number is: "+ findMax(a, b, c));
				
		}
	}

