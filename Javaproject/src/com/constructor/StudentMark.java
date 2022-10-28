package com.constructor;

public class StudentMark {

	String name;
	int rollnum;
	int mark1;
	int mark2;

	public StudentMark(String name, int rollnum) {
		this.name = name;
		this.rollnum = rollnum;

	}

	public int Sum(int mark1, int mark2) {
		int sum;
		this.mark1 = mark1;
		this.mark2 = mark2;
		sum = mark1 + mark2;
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		StudentMark s1 = new StudentMark("krithi", 9);
		s1.Sum(90, 23);
		System.out.println(s1.name + "," + s1.rollnum);

	}

}
