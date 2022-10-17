package com.condition;

import java.util.Scanner;

public class CondionStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of i");

		int i = sc.nextInt();
		if (i >= 20) {
			System.out.println("i is greater");
		} else if (i == 10) {

			System.out.println("i is equal");

		}

		else {
			System.out.println("i is smaller");

		}
	}
}
