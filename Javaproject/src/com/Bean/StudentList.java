package com.Bean;

import java.util.ArrayList;

public class StudentList {
	public static void main(String[] args) {
		ArrayList<Student> studentlist = new ArrayList<>();
	
	Student student1 = new Student(1, "krithi");
	Student student2 = new Student(2, "aadi");
	studentlist.add(student1);
	studentlist.add(student2);
	for (Student student : studentlist) {
		if(student.getName().startsWith("a"))
		
		{
			System.out.println(student.getId()+ " " +student.getName());
		}
	}
		
	}
	
	

}
