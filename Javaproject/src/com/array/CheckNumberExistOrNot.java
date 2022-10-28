package com.array;

public class CheckNumberExistOrNot {

	public static void main(String[] args) {
		
		int[] num = { 1, 2, 3, 4, 5, 6,5, 7, 9 };
		int findnum = 5;
		for (int i = 0; i <num.length; i++) {
			if (findnum == num[i]) {
				System.out.println("If number Exist =" +num[i]);
			
		
		}
			System.out.println("Number Not Found ");
			}
	}

	}

