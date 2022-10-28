package com.constructor;

import java.util.Scanner;

public class Student {
	int english,tamil,maths,maximum;
	double average;
	String name;
	int age;
	public  Student(String name,int age)
	{
		this.name=name;
		this.age=age;
		
		
	}
	public void Accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		name=sc.next();
		System.out.println("Enter the age ");
		age=sc.nextInt();
		System.out.println("Enter english mark");
		english=sc.nextInt();
		System.out.println("enter Tamil marks");
		tamil=sc.nextInt();
		System.out.println("Enter maths marks");
		maths=sc.nextInt();
	}
	public void calculation()
	{
		int max=Math.max(english, tamil);
		maximum =Math.max(maths,max);
		average=(english+tamil+maths)/3;
	}
	public void display()
	{
		System.out.println("name:"+ name);
		System.out.println("age:"+ age);
		System.out.println("english:"+ english);
		System.out.println("Tamil:"+ tamil);
		System.out.println("maths:"+ maths);
		System.out.println("Maximum:"+maximum);
		System.out.println("Average :"+average);
		}
	public static void main(String[] args) {
		Student s1=new Student("krithi",27);
		s1.Accept();
		s1.calculation();
		s1.display();
}
}