package com.stringmethods;

public class FirstRepeatedChar {
	public static char FirstRepeatedChar(String word) {
		char[] character = word.toCharArray();
		for (int i = 0; i < character.length; i++) {
			for (int j = i + 1; j < character.length; j++) {
				if (character[i] == character[j]) {

					return character[i];
				}
			}
		}
		return '0';
	}

	public static void main(String[] args) {
		char Result = FirstRepeatedChar("GeeksofGeeks");
		System.out.println(Result);

	}

}
