package com.operators;

public class LogicalOperator {
	public static void main(String[]args) {
		int a=40,b=20, c=30,d=0;
		if((a== b)||(b==c))
		{
			d=a+b+c+d;
			
			System.out.println("The sum is "+ d);
		}else
			System.out.println("b is equal to c");
		
		
		
	}

}
