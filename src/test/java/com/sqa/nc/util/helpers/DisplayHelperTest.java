/**
 *   File Name: DisplayHelperTest.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */
package com.sqa.nc.util.helpers;

import org.testng.annotations.*;

/**
 * DisplayHelperTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
public class DisplayHelperTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass () throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass () throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeMethod
	public void setUp () throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterMethod
	public void tearDown () throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.sqa.nc.util.helpers.DisplayHelper#display2DArray(int[][])}.
	 */
	@Test
	public void testDisplay2DArray () {
		System.out.println("display 2d array");
		int[][] sudoku = new int[][] {
										{ 0, 8, 0, 4, 0, 2, 0, 6, 0 },
										{ 0, 3, 4, 0, 0, 0, 9, 1, 0 },
										{ 9, 6, 0, 0, 0, 0, 0, 8, 4 },
										{ 0, 0, 0, 2, 1, 6, 0, 0, 0 },
										{ 2, 0, 0, 0, 0, 9, 6, 0, 0 },
										{ 0, 1, 0, 3, 5, 7, 0, 0, 8 },
										{ 8, 4, 0, 0, 0, 0, 0, 7, 5 },
										{ 0, 2, 6, 0, 0, 0, 1, 3, 0 },
										{ 0, 9, 0, 7, 0, 1, 0, 4, 0 }
		};
		int[][] numHolder = new int[][] {
											{ 1, 2, 4 },
											{ 4, 5, 23, 4, 2, 3 }
		};
		DisplayHelper.display2DArray(sudoku);
	}

	/**
	 * Test method for
	 * {@link com.sqa.nc.util.helpers.DisplayHelper#displayArray(int[])}.
	 */
	@Test
	public void testDisplayArray () {
		int[] arrayHolder = {
								1, 2, 3, 8
		};
		System.out.println("display ONE-D array");
		DisplayHelper.displayArray(arrayHolder);
	}
}
