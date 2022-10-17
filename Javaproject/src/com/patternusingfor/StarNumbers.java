package com.patternusingfor;

public class StarNumbers {
	public static void main(String[] args) {
		int row = 5;
		int count = 0;
		for (int i = 1; i <= row; i++) {
			for (int j = row; j >= i; j--)

			{
				System.out.print("  ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(++count+ "   ");
			}
			System.out.println();
		}
	}

}
