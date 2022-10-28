package com.practice;

public class Factorial {
	public static int factorial(int number)
	{
	int i=1,factorial=1;
		while( i<=number)
		{
			factorial*=i;
			i++;
			
		}
		return factorial;
		
	}

	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println(result);
		

	}

}
