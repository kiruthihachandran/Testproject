package com.Loopexamples;

public class EvenSum {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 10; i++) {
			if (i % 2 == 0)
				sum = sum + i;
		}
		System.out.println("Even Sum=" + sum);

	}
}
