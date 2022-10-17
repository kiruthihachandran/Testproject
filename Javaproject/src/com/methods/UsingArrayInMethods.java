package com.methods;

import java.util.Scanner;

public class UsingArrayInMethods {
	public static boolean isStudentPassed(int[] studentmarks, int passmark) {
		for (int i = 0; i < studentmarks.length; i++) {
			if (studentmarks[i] < passmark) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Subjects");
		int noOfSubjects = sc.nextInt();
		int[] marks = new int[noOfSubjects];
		for (int i = 0; i < marks.length; i++) {
			System.out.println("please enter" + i + "subject mark :");
			int mark = sc.nextInt();
			marks[i] = mark;
		}
		System.out.println("Enter The passmark");
		int passmark=sc.nextInt();
		boolean studentPassed = isStudentPassed(marks, passmark);
		if (studentPassed) {
			System.out.println("Student passed");
		} else {
			System.out.println("Student Failed");

		}
	}

}