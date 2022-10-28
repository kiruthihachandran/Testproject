package com.practice;

import java.util.Iterator;

public class fibanocci {
	public static void Fibanocci(int input) {
		int num1=1, num2 =2, sum;
		for (int i = 0; i <input; i++) {
			System.out.println(num1);
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}

	public static void main(String[] args) {
		Fibanocci(10);

	}

}
