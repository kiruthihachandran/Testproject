package com.Loopexamples;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int num = sc.nextInt();

		if (num % 2 != 1) {

			System.out.println("The Given number is even");
		}

		else {

			System.out.println("The Given number is Odd");
		}

	}

}
