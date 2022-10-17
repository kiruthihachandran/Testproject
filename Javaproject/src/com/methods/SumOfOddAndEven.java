package com.methods;

import java.util.Scanner;

public class SumOfOddAndEven {

	public static int sumOfEven(int startNumber, int endNumber) {
		int sum = 0;

		if (startNumber > endNumber) {
			int temp = startNumber;
			startNumber = endNumber;
			endNumber = temp;
		}
		for (int i = startNumber; i <= endNumber; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}

		return sum;
	}

	public static int sumOfOdd(int startNumber, int endNumber) {
		int sum = 0;

		if (startNumber > endNumber) {
			int temp = startNumber;
			startNumber = endNumber;
			endNumber = temp;
		}
		for (int i = startNumber; i < endNumber; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Startnumber");
		int Startnumber = sc.nextInt();
		System.out.println("Enter the Endnumber");
		int Endnumber = sc.nextInt();
		int sumOfEvennumbers = sumOfEven(Startnumber, Endnumber);
		System.out.println(sumOfEvennumbers);
		int  sumOfOddNmubers=sumOfOdd(Startnumber, Endnumber);
		System.out.println(sumOfOddNmubers);
		}

}
