package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();

		List<Integer> numbers= new ArrayList<>();
		int first = 0, second = 1, fib;
		numbers.add(first);
		numbers.add(second);

		for (int i = 2; i < n; i++) {
			fib = second + first;
			first = second;
			second = fib;
			numbers.add(fib);
		}
		System.out.println(numbers);

	}

}
