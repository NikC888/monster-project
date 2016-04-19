/**
 *   File Name: MyMathTest.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */
package com.sqa.nc.util.helpers.math;

import static org.testng.Assert.*;

import org.testng.annotations.*;

/**
 * MyMathTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
public class PowerTests {

	@DataProvider
	public static Object[][] getData () {
		Object[][] data = {
							{ 2.0, 2.0, 4.0 },
							{ 5.0, 2.0, 25.0 },
							{ 4.0, 3.0, 64.0 },
							{ 1.0, 0, 1.0 },
							{ 3.0, 1.0, 3.0 },
							{ 2.0, 1.5, 4.0 }
		};
		return data;
	}

	@Test (dataProvider = "getData")
	public void testPowerNumber (double num, double power, double expectedResult) {
		double actualResult;
		actualResult = MyMath.powerNumber(num, power);
		String message = String.format("the result of %.0f to the power of %.0f is %.0f", num, power, actualResult);
		System.out.println(message);
		// assertEquals(message, expectedResult, actualResult, 0);
		assertEquals(actualResult, expectedResult, 0, message);
	}
}
