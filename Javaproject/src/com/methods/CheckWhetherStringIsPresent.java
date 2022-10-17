package com.methods;

import java.util.Scanner;

public class CheckWhetherStringIsPresent {
	public static boolean isStringPresent(String[] array, String findString) {

		for (int i = 0; i < array.length; i++) {
			if (findString.equals(array[i])) {
				return true;
			}
		}
		return false;
		}
	public static int noOfTimesStringPresent(String[] array, String findString) {
		int count = 0;
		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of String");
		int length = sc.nextInt();
		String[] array = new    String[length];
		for (int i = 0; i < array.length; i++) {
			sc = new Scanner(System.in);
			System.out.println("Enter the  " + i + "string");
			String string = sc.nextLine();
			array[i] = string;
		}
		System.out.println("Enter the String To Find");
		String findstring = sc.nextLine();
		boolean isPresent = isStringPresent(array, findstring);
		if (isPresent) {
			System.out.println("The String is present");
		} else {

			System.out.println("The String is not Present");

		}
		int count = noOfTimesStringPresent(array, findstring);
		System.out.println("The String is present " + ++count + "times");
		

	}
}
