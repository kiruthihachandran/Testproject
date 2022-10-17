
package com.methods;

import java.util.Scanner;

public class MethodsUsingArray {

	public static int[] getArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The array");
		int length = sc.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + i + "th index value");
			int number = sc.nextInt();
			array[i] = number;

		}
		return array;
	}

	public static int[] sortArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
	System.out.println(array[i]);
		}

		return array;
	}

	public static boolean findNumber(int[] array, int findNumber) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > findNumber) {
				return true;
			}
		}
		return false;
	}

	public static int sumOfArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public static int sumOfEvenNumbers(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
			sum = sum + array[i];
			}
		}
		return sum;
	}

	public static int sumOfOddnNumbers(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				sum = sum + array[i];

			}
		}
		return sum;
	}

	public static int[] printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
		return array;
	}

	public static void main(String[] args) {
		int[] inputarray = getArray();
		int[] print=printArray(inputarray);
		System.out.println("The values in array" + print);
		int[] sortedarray = sortArray(inputarray);
		System.out.println("The Sorted array is" + sortedarray);
		Scanner sc = new Scanner(System.in);
		int findNumber = sc.nextInt();
		boolean isExist = findNumber(sortedarray, findNumber);
		if (isExist) {
			System.out.println("Number Found");
		} else {
			System.out.println("Number not found");
		}
		int sum = sumOfArray(sortedarray);
		int even = sumOfEvenNumbers(sortedarray);
		System.out.println("The Even number " + even);
		int odd = sumOfOddnNumbers(sortedarray);
		System.out.println("the Odd number" + odd);

	}

}
