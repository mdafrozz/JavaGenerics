/**
 * 
 */
package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author MD_AFROZ
 *
 */
public class TestCases {
	
	@Test
	// Test Case for the Integer where max_Value at First Position
	public void integerAtFirstPosition() {
		Logic log = new Logic();
		int actualResult = log.findMax(16, 15, 10);
		System.out.println("Maximum at first position: " + actualResult);
		System.out.println("-----------------------------");
		int expectedResult = 16;
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	// Test Case for the Integer where max_Value at second Position
	public void integerAtSecondPosition() {
		Logic log = new Logic();
		int actualResult = log.findMax(10, 15, 11);
		System.out.println("Maximum at second Position: " + actualResult);
		System.out.println("-----------------------------");
		int expectedResult = 15;
		Assert.assertEquals(expectedResult, actualResult);
	}
	
		// Test Case for the Integer where max_Value at Third Position
		@Test
		public void integerAtThirdPosition() {
			Logic log = new Logic();
			int actualResult = log.findMax(11, 10, 12);
			System.out.println("Maximum at third Position: " + actualResult);
			System.out.println("-----------------------------");
			int expectedResult = 12;
			Assert.assertEquals(expectedResult, actualResult);	
	}
		
		// Test Case for the float where max_Value at First Position
		@Test
		public void floatAtFirstPosition() {
			Logic log = new Logic();
			float actualResult = log.findMax(11.2f, 10.3f, 9.4f);
			System.out.println("Maximum at first Position: " + actualResult);
			System.out.println("-----------------------------");
			float expectedResult = 11.2f;
			Assert.assertEquals(expectedResult, actualResult, expectedResult);
		}
		
		// Test Case for the float where max_Value at second Position
		@Test
		public void floatAtSecondPosition() {
			Logic log = new Logic();
			float actualResult = log.findMax(11.2f, 12.3f, 9.4f);
			System.out.println("Maximum at Second Position: " + actualResult);
			System.out.println("-----------------------------");
			float expectedResult = 12.3f;
			Assert.assertEquals(expectedResult, actualResult, expectedResult);
		}
		// Test Case for the float where max_Value at Third Position
				@Test
			public void floatAtThirdPosition() {
				Logic log = new Logic();
				float actualResult = log.findMax(11.2f, 12.3f, 99.4f);
				System.out.println("Maximum at third Position: " + actualResult);
				System.out.println("-----------------------------");
				float expectedResult = 99.4f;
				Assert.assertEquals(expectedResult, actualResult, expectedResult);
			}
				// Test Case for the String where max_Value at First Position
				@Test
				public void stringAtFirstPosition() {
					Logic log = new Logic();
					String actualResult = log.findMax("peach", "banana", "apple");
					System.out.println("Maximum at first Position: " + actualResult);
					System.out.println("-----------------------------");
					String expectedResult = "peach";
					Assert.assertEquals(expectedResult, actualResult);
				}
				// Test Case for the String where max_Value at Second Position
				@Test
				public void stringAtSecondPosition() {
					Logic log = new Logic();
					String actualResult = log.findMax("banana", "peach", "apple");
					System.out.println("Maximum at second Position: " + actualResult);
					System.out.println("-----------------------------");
					String expectedResult = "peach";
					Assert.assertEquals(expectedResult, actualResult);
				}
				// Test Case for the String where max_Value at third Position
				@Test
				public void stringAtThirdPosition() {
					Logic log = new Logic();
					String actualResult = log.findMax("banana", "apple", "peach");
					System.out.println("Maximum at third Position: " + actualResult);
					System.out.println("-----------------------------");
					String expectedResult = "peach";
					Assert.assertEquals(expectedResult, actualResult);
				}
}
