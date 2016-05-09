/**
 * 
 */
package com.javacore.practice.ExpectOutputs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Rakhunathan.M
 *
 */
public class AbabaababaTest {
	Ababaababa ababaababa;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ababaababa = new Ababaababa();
	}

	/**
	 * @throws Throwable
	 */
	@After
	public void tearDown() throws Throwable {
		ababaababa = null;
		this.finalize();
	}

	/**
	 * Test method for
	 * {@link com.javacore.practice.ExpectOutputs.Ababaababa#getOccurances(java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testGetOccurances() {
		System.out.println("No Of Occurances aba in ababaababa = " + ababaababa.getOccurances("ababaababa", "aba"));
		System.out.println("No Of Occurances xax in xaxxaxxaxaxaxxax = " + ababaababa.getOccurances("xaxxaxxaxaxaxxax", "xax"));
	}
}
