package com.Loopexamples;

public class SumEvenNumbers {
	public static void main(String[] args) {
		int i = 2;
		int sum = 0;
		while (i <= 10) {
			if (i % 2 == 0) {
				sum = sum + i;
			}

			i++;
		}

		System.out.println(sum);

	}
}
