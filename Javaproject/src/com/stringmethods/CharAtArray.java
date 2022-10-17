package com.stringmethods;

public class CharAtArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		String s1 = "Java is Programming Language";
		char[] result;
		result = s1.toCharArray();
		for (int i = 0; i < result.length; i++) {

			System.out.println(result);
		}

		String replaceString = s1.replace("Java", "kava");
		System.out.println(replaceString);
		System.out.println("Index of :" + s1.indexOf(2));
		System.out.println("to upper case: " + s1.toUpperCase());
		System.out.println("to lower case:" + s1.toLowerCase());
	}

}
