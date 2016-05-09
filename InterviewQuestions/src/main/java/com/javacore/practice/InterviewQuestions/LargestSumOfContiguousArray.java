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
	Map<Integer, Integer> subArrayCounts = new TreeMap<Integer, Integer>();

	public void splitSubSubArray(int[] array, int subArrayCount) {
		int startIndex = 0;
		int arrayIndex = 0;
		int[] tempArray = new int[subArrayCount];
		for (int j = 0; j < array.length; j += subArrayCount) {
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

	@SuppressWarnings("unused")
	public int getSum(int[] array) {
		int value = 0;
		int bestSoFar = 0;
		int bestNow = 0;
		int bestStartIndexSoFar = -1;
		int bestStopIndexSoFar = -1;
		int bestStartIndexNow = -1;
		for (int i = 0; i < array.length; i++) {
			value = bestNow + array[i];
			if (value > 0) {
				if (bestNow == 0) {
					bestStartIndexNow = i;
					bestNow = value;
				} else {
					bestNow = 0;
				}
			}
			if (bestNow > bestSoFar) {
				bestSoFar = bestNow;
				bestStopIndexSoFar = i;
				bestStartIndexSoFar = bestStartIndexNow;
			}
		}
		return value;
	}
}
