package com.constructor;

public class Mobile {
	String name;
	String color;
	int prize;
	int ram;
	float size;
	long phnum;

	public Mobile() {
		System.out.println("Default Constructor");
	}

	public Mobile(String name, String color, int prize) {
		this.name = name;
		this.color = color;
		this.prize = prize;

	}

	public void MakeCall(long phnum) {

		System.out.println("Make call");
	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Redmi", "Blue", 300000);
		Mobile m2 = new Mobile();
		System.out.println(m1.color);
		System.out.println(m1.name);
		System.out.println(m1.prize);
		m2.MakeCall(90908989);

	}

}
