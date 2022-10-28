package com.array;

public class CheckNumExist {
	public static void main(String[] args)

	{
		boolean isExist = false;
		int arr[] = { 1, 2, 3, 4, 4, 5, 6, 7 };
		int findarr = 3;
		for (int i = 0; i < arr.length; i++) {
			if (findarr == arr[i]) {
				isExist = true;

			}
		}
		if (isExist == true) {

			System.out.println("The number is present");
		} else {
			System.out.println("The number is not present");

		}
	}
}