package com.javacore.practice.InterviewQuestions;


public class StringImmutiblity {
	public static void main(String[] args) {
		String x = "one..";
		System.out.println("1st Hash=" + x.hashCode());
		x = x + "two..";
		System.out.println("2nd Hash=" + x.hashCode());
	}
}
