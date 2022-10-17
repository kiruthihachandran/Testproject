package com.stringmethods;

public class PalindromeShortcut {
	public static boolean palindrome(String name) {
		char[] array = name.toCharArray();
		int endindex = array.length - 1;
		for (int i = 0; i < array.length / 2; i++) {
			char first = name.charAt(i);
			char last = name.charAt(endindex--);
			if (first != last)
				return false;
		}
		return true;	}

	public static void main(String[] args) {
		boolean ispalindrome = palindrome("madam");
		if (ispalindrome) {
			System.out.println("The Given name is palindrome");

		} else {
			
			System.out.println("The Given number is not palindrome");
		}

	}

}