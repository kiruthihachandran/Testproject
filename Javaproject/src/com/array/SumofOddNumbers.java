package com.array;

public class SumofOddNumbers {
	
	public static void main(String[]args)
	{
		int[]num= {2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i = 0;i<num.length;i++)
		{
			if(num[i]%2!=0)
			{
				sum=sum+num[i];
			}
		}
			
			System.out.println(sum);
		}
	}

	
