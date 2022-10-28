package com.practice;

public class Chocolate {
	public static int noOfChocolates(int rupees) {
		
		
		int test=10;
		int noOfChocolates = rupees / 3;
		int Wrappers = noOfChocolates;
		while (Wrappers >= 3) {
			int extraChocolates = Wrappers / 3;
			noOfChocolates = noOfChocolates + extraChocolates;
			int extraWrappers = Wrappers % 3;
			Wrappers = extraChocolates + extraWrappers;
		}
		return noOfChocolates;

	}

	public static void main(String[] args) {

		int chocolates = noOfChocolates(100);
		System.out.println(chocolates);

	}

}
