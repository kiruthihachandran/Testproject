package com.stringmethods;

import java.sql.SQLOutput;

public class ReverseLastWordAndLowerCase {
	public static String reverseLastWord(String sentence) {
		String result = "";
		String Lowercaseeachword = sentence.toLowerCase();
		String[] array = Lowercaseeachword.split(" ");
		int endindex = array.length - 1;
		for (int i = 0; i <= endindex; i++) {
			if (i == endindex) {
				String lastname = array[endindex];
				String reverse = "";
				char[] lastword = lastname.toCharArray();
				for (int j = lastword.length - 1; j >= 0; j--) {
					reverse = reverse + lastword[j];
					array[endindex] = reverse;
				}
			}
			result = result + array[i].concat(" ");
		}
		return result;

	}

	public static void main(String[] args) {
		String name = reverseLastWord("T20 World Cup Is Happening In Australia");
		System.out.println(name);

	}

}
