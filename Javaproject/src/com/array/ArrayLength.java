package com.array;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array Length = ");{
			int length=sc.nextInt();
			int arr[]=new int[length];
			for(int i=0;i<arr.length;i++)
			{
			
				System.out.println("Enter the "+ i+ "th index value");
				int value=sc.nextInt();
			}
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
				
			}
			
		}
	}