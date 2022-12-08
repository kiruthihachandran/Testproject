package com.practice;

public class SecondLargestArray {

	public static void main(String[] args) {

		int array[] = { 12, 76, 89, 87, 89 };

		int largest = 0;
		int SecondLargest = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > SecondLargest && largest > array[i]) {
				SecondLargest = array[i];

			} else if (array[i] > largest) {
				SecondLargest = largest;
				largest = array[i];
			}
		}

		System.out.println(SecondLargest);

	}
}
