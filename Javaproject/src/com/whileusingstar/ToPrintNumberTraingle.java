package com.whileusingstar;

public class ToPrintNumberTraingle {

	public static void main(String[]args)
	{
		int row=1;int count=0;
		while(row<=5)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(" ");
			}
			for(int col=5;col>=row;col--)
			{
				System.out.print(count+"  ");
				count ++;
			}
			System.out.println();
			row++;
			}
		}
	}
