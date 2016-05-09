/**
 * 
 */
package com.javacore.practice.InterviewQuestions;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Rakhunathan.M
 *
 */
public class LargestSumOfContiguousArrayTest {
	LargestSumOfContiguousArray largestSumOfContiguousArray;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		largestSumOfContiguousArray = new LargestSumOfContiguousArray();
	}

	/**
	 * @throws Throwable
	 */
	@After
	public void tearDown() throws Throwable {
		largestSumOfContiguousArray = null;
		this.finalize();
	}

	/**
	 * Test method for
	 * {@link com.javacore.practice.InterviewQuestions.LargestSumOfContiguousArray#getSum(int[])}
	 * .
	 */
	// @Test
	public void testGetLargestSum() {
		int[] array = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = i;
		}
		System.out.println("Largest sum of Subarray = " + largestSumOfContiguousArray.getSum(array));
	}

	@Test
	/**
	 * 
	 */
	public void splitSubSubArrayTest() {
		int[] array = new int[100];
		System.out.println("Elements In the Array");
		for (int i = 0; i < 10; i++) {
			array[i] = i;
			System.out.print(array[i] + ",");
		}
		System.out.println();
		largestSumOfContiguousArray.splitSubSubArray(array, 5);
		System.out.println("\nElements In the Array");
		for (int i = 0; i < 100; i++) {
			array[i] = new Random().nextInt(100);
			System.out.print(array[i] + ",");
		}
		System.out.println();
		largestSumOfContiguousArray.splitSubSubArray(array, 4);
	}
}
