/**
 * 
 */
package com.javacore.practice.InterviewQuestions.LinkedList;

/**
 * @author Rakhunathan.M
 *
 */
public class LinkedList {
	private Node head;

	public LinkedList() {
		this.head = new Node("head");
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node head() {
		return head;
	}

	public void appendIntoTail(Node node) {
		Node current = head;
		while (current.next() != null) {
			current = current.next();
		}
		current.setNext(node);
	}
}
