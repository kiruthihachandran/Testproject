package com.Loopexamples;

import com.stringmethods.ReverseAString;

public class Palindrome {

	public static boolean palindrome(String input) {

		String rev = ReverseAString.stringReverse(input);
		if (input.equalsIgnoreCase(rev)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean pallindrome = palindrome("Malayam");
		if (pallindrome) {
			System.out.println("pallindrome");
		} else {
			System.out.println("not palindrome");
		}

	}
}
