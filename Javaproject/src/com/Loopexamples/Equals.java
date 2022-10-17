package com.Loopexamples;

import java.util.Scanner;

public class Equals {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = s.nextLine();
		if (name.equals("kirthi")) 
		{
			System.out.println("The Given name is = " + name);
		}

		 else if (name.equals("ramyaa")) 
		{
			System.out.println("The name is not ="+name);
		}
		 else
		 { 
			 System.out.println("mm");
		 }

	}

}
