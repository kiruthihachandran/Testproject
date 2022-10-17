package com.array;

import java.util.Scanner;

public class FindStringIn1Array {

	public static void main(String[] args) {

		String arr[] = { "kirthi", "rami", "sowmi", "rami" };
		boolean isExist = false;
		String findstring = "kavyaa";

		for (int i = 0; i < arr.length; i++) {

			if (findstring == arr[i]) {
				isExist = true;
			}

		}
		if (isExist == true) {
			System.out.println("String is present");
		} else {
			System.out.println("String is not present");

		}
	}

}
