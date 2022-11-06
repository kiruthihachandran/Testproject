package com.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String name = "Racre";
		String answer = "caree";
		char a[] = name.toCharArray();
		char b[] = answer.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result = Arrays.equals(a, b);
		if (result == true) {
			System.out.println("The given String is anagram");

		} else {
			System.out.println("The given string is not Anagram");
		}

	}

}
