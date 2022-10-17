package com.patternusingfor;

public class ReverseLeftStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int row=1;row<=5;row++)
		{
			for(int col=2*(5-row);col>=row;col--)
			
			{
				System.out.print(" *");
			}
			for(int col=5;col<=row;col++)
			{
				System.out.print("");
			}
			System.out.println();
			
	}

}
}
