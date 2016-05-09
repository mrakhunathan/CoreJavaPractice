package com.javacore.practice.InterviewQuestions;

import java.util.Stack;

public class StackRev {
	int count = 0;

	public Stack<String> reverseMe(Stack<String> parentStack) {
		Stack<String> newStack = new Stack<String>();
		while (parentStack.size() > 0) {
			newStack.push(parentStack.pop());
		}
		return newStack;
	}

	public Stack<String> reverseMeWithOutExtraVars(Stack<String> parentStack) {
		if (count < parentStack.size()) {
			parentStack.add(count, parentStack.pop());
			count++;
			reverseMeWithOutExtraVars(parentStack);
		}
		return parentStack;
	}
}
