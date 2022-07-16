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
		int expectedResult = 16;
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	// Test Case for the Integer where max_Value at second Position
	public void integerAtSecondPosition() {
		Logic log = new Logic();
		int actualResult = log.findMax(10, 15, 11);
		System.out.println("Maximum at second Position: " + actualResult);
		int expectedResult = 15;
		Assert.assertEquals(expectedResult, actualResult);
	}
}
