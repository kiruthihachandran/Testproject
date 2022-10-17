package com.stringmethods;

public class ReverseAString {
	public static String stringReverse(String name) {
		char[] ch = name.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(stringReverse("kiruthiha"));
		
	}

}
