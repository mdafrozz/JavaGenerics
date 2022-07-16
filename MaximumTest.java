/**
 * 
 */
package com.bridgelabz;


/**
 * @author MD_AFROZ
 *
 */
class MaximumTest {

	public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
		System.out.println("The numbers are : " + a + ", "
				+ b + ", " + c);
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
		System.out.println("Maximum Integer value is: "+ findMax(a, b, c));
		System.out.println("-----------------------------");
		
		float x = 1.1f, y = 2.1f, z = 3.1f;
		System.out.println("Maximum Float value is: "+ findMax(x, y, z));
		System.out.println("-----------------------------");
		
		String s1 = "Hi!!..", s2 = "How", s3 = "are you?";
		System.out.println("Maximum String value is: "+ findMax(s1, s2, s3));
		System.out.println("-----------------------------");
		}
	}

