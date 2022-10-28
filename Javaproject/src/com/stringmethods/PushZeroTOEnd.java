package com.stringmethods;

public class PushZeroTOEnd {
	public static int[] pushZero(int[] inputarray, int length) {
		int count = 0;
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] != 0) {
				inputarray[count++] = inputarray[i];
			}
		}
		while (count < length) {
			inputarray[count++] = 0;

		}

		return inputarray;
	}

	public static void main(String[] args) {
		int[] inputarray = { 12, 3, 0, 45, 0, 4, 9, 0 };
		int[] output = pushZero(inputarray, 8);
		for (int i = 0; i < output.length; i++) {

			System.out.println(output[i]);
		}
	}
}
