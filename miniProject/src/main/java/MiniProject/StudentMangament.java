package MiniProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import Bean.Student;
import Bean.Subject;

public class StudentMangament {

	private List<Student> prepareStudentsData() {  
		ArrayList<Subject> student1subjectlist = new ArrayList<>();

		Subject a1 = new Subject("DataStructure", 1101, 45, 1);
		Subject a2 = new Subject("Physics", 1102, 65, 1);
		Subject a3 = new Subject("Chemistry", 1103, 85, 1);
		Subject a4 = new Subject("Maths", 1104, 49, 1);
		Subject a5 = new Subject("English", 1105, 55, 1);

		student1subjectlist.add(a1);
		student1subjectlist.add(a2);
		student1subjectlist.add(a3);
		student1subjectlist.add(a4);
		student1subjectlist.add(a5);

		ArrayList<Subject> student2subjectlist = new ArrayList<>();

		Subject a6 = new Subject("DataStructure", 1101, 90, 1);
		Subject a7 = new Subject("Physics", 1102, 64, 1);
		Subject a8 = new Subject("Chemistry", 1103, 98, 1);
		Subject a9 = new Subject("Maths", 1104, 80, 1);
		Subject a10 = new Subject("English", 1105, 100, 1);

		student2subjectlist.add(a6);
		student2subjectlist.add(a7);
		student2subjectlist.add(a8);
		student2subjectlist.add(a9);
		student2subjectlist.add(a10);
		ArrayList<Subject> student3subjectlist = new ArrayList<>();

		Subject b1 = new Subject("c", 1201, 29, 2);
		Subject b2 = new Subject("java", 1202, 12, 2);
		Subject b3 = new Subject("embeddedsystem", 1203, 99, 2);
		Subject b4 = new Subject("artificialintellegence", 1204, 89, 2);

		student3subjectlist.add(b1);
		student3subjectlist.add(b2);
		student3subjectlist.add(b3);
		student3subjectlist.add(b4);

		ArrayList<Subject> student4subjectlist = new ArrayList<>();

		Subject b5 = new Subject("c", 1201, 67, 2);
		Subject b6 = new Subject("java", 1202, 97, 2);
		Subject b7 = new Subject("embeddedsystem", 1203, 900, 2);
		Subject b8 = new Subject("artificialintellegence", 1204, 67, 2);
		student4subjectlist.add(b5);
		student4subjectlist.add(b6);
		student4subjectlist.add(b7);
		student4subjectlist.add(b8);

		ArrayList<Student> studentList = new ArrayList<>();
		Student student1 = new Student(101, "krithi", "CSE", student1subjectlist);
		Student student2 = new Student(102, "ramyaa", "CSE", student2subjectlist);
		Student student3 = new Student(103, "priya", "ECE", student3subjectlist);
		Student student4 = new Student(104, "Sangeetha", "ECE", student4subjectlist);
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);

		return studentList;
	}

	public void printData(List<Student> studentList) {
		for (Student studentData : studentList) {
			System.out.println(studentData);

		}
	}

	public List<Student> getPassedSudent(List<Student> studentList) {
		List<Student> passStudents = new ArrayList<Student>();
		for (Student studentData : studentList) {
			Boolean isPassed = true;
			for (Subject subject : studentData.getSubjectlist()) {
				if (subject.getMarks() < 35) {
					isPassed = false;
					break;
				}
			}
			if (isPassed) {
				passStudents.add(studentData);
			}
		}
		return passStudents;

	}

	public List<Student> getFailedSudent(List<Student> studentList) {
		List<Student> failedStudents = new ArrayList<Student>();
		for (Student studentData : studentList) {
			Boolean isfailed = false;
			for (Subject subject : studentData.getSubjectlist()) {
				if (subject.getMarks() < 35) {
					isfailed = true;
					break;
				}
			}
			if (isfailed) {
				failedStudents.add(studentData);
			}
		}
		return failedStudents;

	}

	public List<Student> sumOfSubjects(List<Student> studentList) {

		List<Student> students = new ArrayList<>();
		for (Student studentData : studentList) {
			int sum = 0;
			for (Subject subjectlist : studentData.getSubjectlist()) {
				sum = sum + subjectlist.getMarks();
			}
			studentData.setTotal(sum);
			students.add(studentData);
		}
		return students;
	}

	public List<Student> getHighestTotal(List<Student> studentList) {
		List<Student> highestTotalStudents = new ArrayList<Student>();
		for (Student studentData : studentList) {
			if (highestTotalStudents.size() == 0) {
				highestTotalStudents.add(studentData);
			} else {
				Student highestMark = highestTotalStudents.get(0);
				if (highestMark.getTotal() == studentData.getTotal()) {
					highestTotalStudents.add(studentData);

				} else if (highestMark.getTotal() < studentData.getTotal()) {
					for (Iterator iterator = highestTotalStudents.iterator(); iterator.hasNext();) {
						iterator.next();
						iterator.remove();
					}
					highestTotalStudents.add(studentData);
				}
			}
		}
		return highestTotalStudents;

	}

	public Map<String, List<Student>> getStudentsByDept(List<Student> studentList, String dept) {
		Map<String, List<Student>> deptStudents = new HashMap<>();
		List<Student> studentsByDept = new ArrayList<>();
		for (Student studentData : studentList) {
			if (studentData.getDept().equalsIgnoreCase(dept)) {
				studentsByDept.add(studentData);
			}
		}
		deptStudents.put(dept, studentsByDept);
		return deptStudents;
	}

	public Map<String, List<Student>> getStudentByParticularDept(List<Student> studentList) {
		Map<String, List<Student>> StudentByDept = new HashMap<>();
		List<Student> studentByParticularDept = null;

		for (Student student : studentList) {
			if (StudentByDept.containsKey(student.getDept())) {

				studentByParticularDept.add(student);

				StudentByDept.put(student.getDept(), studentByParticularDept);
			} else {
				studentByParticularDept = new ArrayList<>();
				studentByParticularDept.add(student);
				StudentByDept.put(student.getDept(), studentByParticularDept);

			}
		}
		return StudentByDept;

	}

	public static void main(String[] args) {

		StudentMangament management = new StudentMangament();
		List<Student> studentdetails = management.prepareStudentsData();
		management.printData(studentdetails);
		System.out.println("Passedstudent");
		management.printData(management.getPassedSudent(studentdetails));
		System.out.println("Failed Student");
		management.printData(management.getFailedSudent(studentdetails));
		System.out.println("Students total");
		management.printData(management.sumOfSubjects(studentdetails));
		System.out.println("Highest Total");
		management.printData(management.getHighestTotal(studentdetails));
		System.out.println("students by dept");
		Map<String, List<Student>> getStudentBydept = management.getStudentsByDept(studentdetails, "cse");
		for (Entry<String, List<Student>> entry : getStudentBydept.entrySet()) {
			System.out.println(entry.getValue() + " " + entry.getKey());
			System.out.println("Get by dept");
			Map<String, List<Student>> particularDeptstudent = management.getStudentByParticularDept(studentdetails);
			for (Map.Entry<String, List<Student>> e1 : particularDeptstudent.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());

			}
		}

	}
}
