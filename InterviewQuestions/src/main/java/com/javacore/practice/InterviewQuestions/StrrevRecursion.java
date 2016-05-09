package com.javacore.practice.InterviewQuestions;

public class StrrevRecursion {
	int count = 0;

	public String reverseMe(String parentString) {
		if (count < parentString.length() / 2) {
			char parentStringArray[] = parentString.toCharArray();
			char tempChar = parentStringArray[count];
			parentStringArray[count] = parentStringArray[(parentStringArray.length - 1) - count];
			parentStringArray[(parentStringArray.length - 1) - count] = tempChar;
			count++;
			return reverseMe(String.valueOf(parentStringArray));
		}
		return parentString;
	}

	public String strRevWithoutRecursion(String parentString) {
		String resultString = "";
		for (int i = parentString.length() - 1; i >= 0; i--) {
			resultString += parentString.charAt(i);
		}
		return resultString;
	}
}
