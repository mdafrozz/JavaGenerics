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
		System.out.println("Maximum is: " + actualResult);
		int expectedResult = 16;
		Assert.assertEquals(expectedResult, actualResult);
	}
}
