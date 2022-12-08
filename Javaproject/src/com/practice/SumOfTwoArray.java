package com.practice;

public class SumOfTwoArray {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 5, 6 };
		int[] array2 = { 2, 0, 6 };
		int sumofArray1 = 0, sumofArray2 = 0, Total = 0;

		sumofArray1 = extracted(array1);

		sumofArray2 = extracted(array2);
		Total = sumofArray1 + sumofArray2;
		System.out.println(Total);
	}

	private static int extracted(int[] array1) {
		int sumofArray1 = 0;
		for (int i = 0; i < array1.length; i++) {
			int temp = array1[i];
			for (int j = 1; j < array1.length - i; j++) {
				temp = temp * 10;
			}
			sumofArray1 += temp;
		}
		return sumofArray1;
	}
}
