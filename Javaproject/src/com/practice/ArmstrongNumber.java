package com.practice;

public class ArmstrongNumber {
	public static void armstrong(int number) {
		int newNumber = 0, remainder, temp;
		temp = number;
		while (temp != 0) {
			remainder = temp % 10;
			newNumber = newNumber + (remainder * remainder * remainder);
			temp = temp / 10;
		}
		if (newNumber == number) {
			System.out.println(number + " is armstrong");
		} else {
			System.out.println(number + "is not armstrong number");
		}

	}

	public static void main(String[] args) {
		armstrong(407);

	}

}
