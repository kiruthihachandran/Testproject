package com.operators;

import java.util.Scanner;

public class AndOrOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();

		if (i < 0) {
 
			System.out.println("The Given Number is Negative");
		} else if ((i >= 0) &&(i <= 100)) {

			System.out.println("The Given Number is between 0-100");
		} else if ((i >= 101) &&(i <= 200)) {

			
			System.out.println("The Given number is between 101-200");
		}

		else {
			System.out.println("The given number is greater than 200");

		}

	}

}
