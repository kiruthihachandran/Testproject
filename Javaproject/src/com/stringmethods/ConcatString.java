package com.stringmethods;

public class ConcatString {

	public static void main(String[] args) {
		String s1="Hello kiruthiha";
		s1=s1.concat("World");
		System.out.println(s1);
		String s2="Hello";
		s2=s2.concat("World");
		String s3=s2.concat("Hello");
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.substring(4));
		System.out.println(s1.length());
		boolean startswith=s1.startsWith("he");
		System.out.println("startswith "+ s1 );
		

	}

}
