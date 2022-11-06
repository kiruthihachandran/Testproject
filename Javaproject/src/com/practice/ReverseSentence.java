package com.practice;

public class ReverseSentence {

	public static void main(String[] args) {

		String sentence[] = "selenium web driver".split(" ");
		String answer = "";
		for (int i = sentence.length - 1; i >= 0; i--) {
			
			answer += sentence[i] + " ";
		}
		System.out.println("Reversed String: " + answer);
	}

}
