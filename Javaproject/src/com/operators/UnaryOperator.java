package com.operators;

public class UnaryOperator {

	public static void main(String[] args) {
		int a = 10,b = 20;
		int c= ++a + b++;
		System.out.println(c);
		int m=10,n=20;
		int x= ++m  + ++n;
		System.out.println(x);
		int d=2,e=3;
		int z=d++ + ++e;
		System.out.println(z);
		int k=2;
		int l = k++ + ++k * --k - k--;
		System.out.println(l);
		
		
		
		


		
		

	}
}
