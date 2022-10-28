package com.practice;

public class MissingNumber {

	public static int FindMissingNumber(int[] array) {

		int n = array.length + 1;
		int sum1 = (n * (n + 1)) / 2;
		int sum2 = 0;
		for (int i = 0; i < array.length; i++) {
			sum2 = sum2 + array[i];
		}
		return sum1 - sum2;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 7, 8, 9 };
		System.out.println(FindMissingNumber(array));
	}
}