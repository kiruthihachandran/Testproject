package Bean;

public class Subject {
	private String subjectname;
	private int subjectcode;
	private int marks;
	private int semester;

	public Subject(String subjectname, int subjectcode, int marks, int semester) {
		super();
		this.subjectname = subjectname;
		this.subjectcode = subjectcode;
		this.marks = marks;
		this.semester = semester;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public int getSubjectcode() {
		return subjectcode;
	}

	public void setSubjectcode(int subjectcode) {
		this.subjectcode = subjectcode;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "Subject [subjectname=" + subjectname + ", subjectcode=" + subjectcode + ", marks=" + marks
				+ ", semester=" + semester + "]";
	}

}
