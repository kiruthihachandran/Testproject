package com.stringmethods;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hello";
		s1=s1.toLowerCase();
		String s2="Hello";
		s2=s1.replace('H','h');
		String s3=s2.toUpperCase();
		System.out.println(s3);
		System.out.println(s1);
		System.out.println(s2);
		char ch =s1.charAt(4);
		System.out.println(ch);
		
		
	}

}
