package com.methods;

public class SumOfArray {
	static int sumOfArray(int[] arr, int length) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;

	}

	public static void main(String[] args) {
		int arr[] = { 12, 34, 5, 6, 7 };
		int sum = sumOfArray(arr, 5);

		System.out.println(sum);

	}

}
