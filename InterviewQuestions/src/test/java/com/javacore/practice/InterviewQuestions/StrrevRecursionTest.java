package com.javacore.practice.InterviewQuestions;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StrrevRecursionTest {
	StrrevRecursion strrevRecursion;

	@Before
	public void setUp() throws Exception {
		strrevRecursion = new StrrevRecursion();
	}

	@After
	public void tearDown() throws Throwable {
		strrevRecursion = null;
		this.finalize();
	}

	@Test
	public void testReverseMe() {
		System.out.println("Reversing - sample = " + strrevRecursion.reverseMe("sample"));
		System.out.println("Reversing - Google = " + strrevRecursion.reverseMe("Google"));
		System.out.println("Reversing - Alphabet = " + strrevRecursion.reverseMe("Alphabet"));
	}

	@Test
	public void testStrRevWithoutRecursion() {
		System.out.println("Reversing - Hello = " + strrevRecursion.strRevWithoutRecursion("Hello"));
		System.out.println("Reversing - one = " + strrevRecursion.strRevWithoutRecursion("one"));
	}
}
