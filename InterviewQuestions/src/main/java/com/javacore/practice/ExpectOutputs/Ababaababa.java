package com.javacore.practice.ExpectOutputs;

/**
 * @author Rakhunathan.M
 *
 */
public class Ababaababa {
	// TODO:Write a program to obtain count no of occurrences of "aba" in
	// "ababaababa"
	public int getOccurances(String parentString, String subString) {
		int count = 0;
		int starter = 0;
		String thisString = "";
		char[] parentStringArray = parentString.toCharArray();
		for (int i = 0; i < parentStringArray.length; i++) {
			if (starter + subString.length() - 1 < parentStringArray.length) {
				for (int j = starter; j < starter + subString.length(); j++) {
					thisString += parentStringArray[j];
				}
				if (thisString.equalsIgnoreCase(subString))
					count++;
				starter++;
				thisString = "";
			}
		}
		return count;
	}
}
