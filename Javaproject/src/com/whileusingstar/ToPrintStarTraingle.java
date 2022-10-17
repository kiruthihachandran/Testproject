package com.whileusingstar;

public class ToPrintStarTraingle {
	public static void main(String[]args)
	{
		int row=1;
		while(row<=5)
		{
			for(int col=1;col<=row;col++) {
				System.out.print(" ");
				
				}
			for(int col=5;col>=row;col--)
			{
				System.out.print( " * ");
			}
			System.out.println();
			row++;
				
			}
		}
			
}
