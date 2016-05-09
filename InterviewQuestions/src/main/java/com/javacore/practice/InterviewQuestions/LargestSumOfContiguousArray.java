package com.javacore.practice.InterviewQuestions;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author Rakhunathan.M
 *
 */
public class LargestSumOfContiguousArray {

	public void splitSubSubArray(int[] array, int subArrayCount) {
		Map<Integer, Integer> subArrayCounts = new TreeMap<Integer, Integer>();
		int startIndex = 0;
		int arrayIndex = 0;
		int[] tempArray = new int[subArrayCount];
		while (startIndex + subArrayCount < array.length) {
			for (int i = startIndex; i < startIndex + subArrayCount; i++) {
				tempArray[arrayIndex] = array[i];
				arrayIndex++;
			}
			subArrayCounts.put(startIndex, getSum(tempArray));
			startIndex += subArrayCount;
			arrayIndex = 0;
		}
		int maxValue = Collections.max(subArrayCounts.values());
		for (Entry<Integer, Integer> item : subArrayCounts.entrySet()) {
			if (item.getValue().equals(maxValue)) {
				startIndex = item.getKey();
			}
		}

		System.out.print("Maximum Sum of SubArray[");
		for (int i = startIndex; i < startIndex + subArrayCount; i++) {
			tempArray[arrayIndex] = array[i];
			System.out.print(array[i] + " ");
			arrayIndex++;
		}
		System.out.print("] is " + maxValue);
	}

	public int getSum(int[] array) {
		int m = 0;
		for (int i = 0; i < array.length; i++) {
			m += array[i];
		}
		return m;
	}
}