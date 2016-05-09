/**
 * 
 */
package com.javacore.practice.InterviewQuestions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.javacore.practice.InterviewQuestions.LinkedList.CheckLinkedListCircular;
import com.javacore.practice.InterviewQuestions.LinkedList.LinkedList;
import com.javacore.practice.InterviewQuestions.LinkedList.Node;

/**
 * @author Rakhunathan.M
 *
 */
public class CheckLinkedListCircularTest {
	CheckLinkedListCircular checkLinkedListCircular;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		checkLinkedListCircular = new CheckLinkedListCircular();
	}

	/**
	 * @throws Throwable
	 */
	@After
	public void tearDown() throws Throwable {
		checkLinkedListCircular = null;
		this.finalize();
	}

	/**
	 * Test method for
	 * {@link com.javacore.practice.InterviewQuestions.LinkedList.CheckLinkedListCircular#isListCircular(java.util.LinkedList)}
	 * .
	 */
	@Test
	public void testIsListCircular() {
		LinkedList thisList = new LinkedList();
		Node newNode = new Node("FirstNode");
		thisList.setHead(newNode);
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				Node thisNode = new Node("FirstNode");
				newNode.setNext(thisNode);
				newNode = newNode.next();
			}
			Node thisNode = new Node("" + i);
			newNode.setNext(thisNode);
			newNode = newNode.next();
		}
		if (checkLinkedListCircular.isListCircular(thisList))
			System.out.println("The Given List is Circular");
		else
			System.out.println("The Given List is Not Circular");
	}
}
