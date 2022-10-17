package com.methods;

public class ArithematicOpration {

	public static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	static int sub(int x, int y) {
		int sub = x - y;
		return sub;
	}

	static int mul(int x, int y) {
		int mul = x * y;
		return mul;
	}

	static int div(int x, int y) {
		int div = x / y;
		return div;
	}

	public static void main(String[] args) {
		int sum = add(10, 29);
		int sub = sub(23, 45);
		int mul = mul(2, 5);
		int div = div(2, 4);

		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}

}