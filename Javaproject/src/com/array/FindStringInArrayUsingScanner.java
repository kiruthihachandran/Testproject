package com.array;

import java.util.Scanner;

public class FindStringInArrayUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the array length");
		int length = sc.nextInt();
		String arr[] = new String[length];

		for (int i = 0; i < arr.length; i++) {
			sc = new Scanner(System.in);
			System.out.println("Enter the " + i + "th index value");

			String name = sc.nextLine();
			arr[i] = name;
		}
		System.out.println("Enter The Name To Find");
		String findname = sc.nextLine();

		for (int i = 0; i < arr.length; i++) {
			if (findname.equals(arr[i]))
				count++;
		}
		System.out.println(count);
	}

}
