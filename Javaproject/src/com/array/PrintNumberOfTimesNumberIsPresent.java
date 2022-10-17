package com.array;

public class PrintNumberOfTimesNumberIsPresent {
	public static void main(String[] args) {
		int arr[] = { 1, 6, 5, 4, 3, 5, 2 };

		int total = 0;
		int findnum = 5;
		{
			for (int i = 0; i < arr.length; i++) {
				if (findnum == arr[i]) {
					total++;
				}
			}
			System.out.println("The Number " +  findnum +  " is Present " + total + " times");

		}
	}

}
