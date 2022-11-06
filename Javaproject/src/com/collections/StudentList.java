package com.collections;

import java.util.ArrayList;
import java.util.List;

import com.constructor.Student;

public class StudentList {
	int id;
	String name;

	public StudentList(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		List<StudentList> sl = new ArrayList<>();
		StudentList s1 = new StudentList(1, "aadi");
		StudentList s2 = new StudentList(2, "akhil");
		StudentList s3 = new StudentList(3, "kirthi");
		StudentList s4 = new StudentList(4, "akash");
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		sl.add(s4);
		System.out.println(s1.id + "  " + s1.name);

		System.out.println(s2.id + "  " + s2.name);
		System.out.println(s3.id + "  " + s3.name);
		System.out.println(s4.id + "  " + s4.name);
		for (StudentList studentList : sl) {
			if (studentList.name.startsWith("a")) {
				System.out.println(" Name starts with A:" + studentList.name);

			}

		}

	}
}