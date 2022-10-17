package com.stringmethods;

public class ReverseByEachWord {
	
	public static String reverseWord(String name) {
		String reverseString = "";

		String array[] = name.split(" ");
		for (int i = 0; i < array.length; i++) {

			String reverseword = ReverseAString.stringReverse(array[i]);
			reverseString = reverseString + reverseword+" ";
		}
		return reverseString.trim();
	}

	public static void main(String[] args) {
		String output = reverseWord("Hai this is kiruthiha");
		System.out.println(output);

	}

}
