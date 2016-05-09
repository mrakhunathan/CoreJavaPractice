package com.javacore.practice.InterviewQuestions.LinkedList;

/**
 * @author Rakhunathan.M
 *
 */
public class CheckLinkedListCircular {
	Node headNode = null;

	public boolean isListCircular(LinkedList parentList) {
		boolean isCircular = false;
		headNode = parentList.head();
		System.out.println("Printing all Nodes..");
		printAllNodes(headNode);
		isCircular = isNodeCircular(headNode);
		while (headNode.next() != null) {
			isCircular = isNodeCircular(headNode.next());
			if (isCircular)
				return true;
			else
				headNode = headNode.next();
		}
		return isCircular;
	}

	private boolean isNodeCircular(Node node) {
		if (node.next() != null) {
			if (node.next().data() == headNode.data()) {
				return true;
			} else {
				return isNodeCircular(node.next());
			}
		}
		return false;
	}

	private void printAllNodes(Node node) {
		System.out.println(node.data());
		if (node.next() != null) {
			printAllNodes(node.next());
		}
	}
}
