package com.practice;

import java.util.Scanner;

public class ChocolatePrblm {
	public static int noOfChocolates(int rupees, int cost, int wrappers) {
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

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Rupees");
		int rupees = sc.nextInt();
		System.out.println("Enter the Cost");
		int cost = sc.nextInt();
		System.out.println("Enter the no of wrappers :");
		int wrappers = sc.nextInt();
		int chocolates = noOfChocolates(rupees, cost, wrappers);
		System.out.println(chocolates);

	}

}
