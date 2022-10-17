package com.methods;

import java.util.Scanner;

public class SortArrayUsingMethods {
	public static int[] prepareData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter the" + i + "th index value");
			int number = sc.nextInt();
			arr[i] = number;
		}

		return arr;
	}

	public static int[] sortArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i+1; j < inputArray.length; j++) {
				if (inputArray[i] > inputArray[j]) {
					int temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		return inputArray;
	}

	public static void printArray(int[] sortArray) {
		for (int i = 0; i < sortArray.length; i++) {
			System.out.println(sortArray[i]);
		}

	}

	public static void main(String[] args) {
		int[] inputarray = prepareData();
		int[] sortedArray = sortArray(inputarray);
		printArray(sortedArray);

	}

}
