package com.array;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = { 20, 11, 13, 14, 10 };
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = arr[i];

				if (arr[i] > arr[j]) {
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			System.out.println(arr[i]);

		}
	}

}
