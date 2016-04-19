/**
 *   File Name: RequestInputInfo.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */
package com.sqa.nc.util.helpers;

import org.testng.annotations.*;

/**
 * RequestInputInfo //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
public class RequestInputInfo {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass () throws Exception {
		System.out.println("before class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass () throws Exception {
		System.out.println("after class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeMethod
	public void setUp () throws Exception {
		System.out.println("\t before test method ");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterMethod
	public void tearDown () throws Exception {
		System.out.println("\t after test method ");
	}

	@Test
	public void test1 () {
		System.out.println("\t\ttest 1");
	}

	@Test
	public void test2 () {
		System.out.println("\t\ttest 2");
	}
}
