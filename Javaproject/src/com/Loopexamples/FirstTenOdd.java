package com.Loopexamples;

public class FirstTenOdd {
	public static void main(String[] args)

	{
		System.out.println("First Ten Odd Numbers");
		for (int i = 1; i < 20; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}
