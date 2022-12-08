package Bean;

import java.util.ArrayList;

public class Student {
	private int id;
	private String name;
	private String dept;
	private int rank;
	private int total;
	ArrayList<Subject> subjectlist;
	final static int PassMark = 35;

	public Student(int id, String name, String dept, ArrayList<Subject> subject) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.subjectlist = subject;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public ArrayList<Subject> getSubjectlist() {
		return subjectlist;
	}

	public void setSubjectlist(ArrayList<Subject> subjectlist) {
		this.subjectlist = subjectlist;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", rank=" + rank + ", total=" + total
				+ ", subjectlist=" + subjectlist + "]";
	}

}
