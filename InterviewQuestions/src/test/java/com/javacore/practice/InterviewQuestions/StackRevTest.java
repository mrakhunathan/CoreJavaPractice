package com.javacore.practice.InterviewQuestions;

import java.util.Stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackRevTest {
	StackRev stackRev = null;

	@Before
	public void setUp() throws Exception {
		stackRev = new StackRev();
	}

	@After
	public void tearDown() throws Throwable {
		stackRev = null;
		this.finalize();
	}

	@Test
	public void testReverseMe() {
		Stack<String> parentStack = new Stack<String>();
		for (int i = 0; i < 10; i++) {
			parentStack.push("" + i);
		}
		System.out.println("Original Stack");
		System.out.println(parentStack);
		System.out.println("Reversed Stack");
		System.out.println(stackRev.reverseMe(parentStack));
	}

	@Test
	public void testReverseMeWithOutExtraVars() {
		Stack<String> parentStack = new Stack<String>();
		for (int i = 0; i < 10; i++) {
			parentStack.push("" + i);
		}
		System.out.println("Original Stack");
		System.out.println(parentStack);
		System.out.println("Reversed Stack");
		System.out.println(stackRev.reverseMeWithOutExtraVars(parentStack));
	}
}
