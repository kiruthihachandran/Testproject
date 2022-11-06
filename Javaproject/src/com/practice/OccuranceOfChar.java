package com.practice;

public class OccuranceOfChar {

	public static void main(String[] args) {
		String input = "selenium web driver";
		char find = 'e';

		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == find)
				count++;
		}

		System.out.println("The Character '" + find + "' appears " + count + " times.");
	}

}
