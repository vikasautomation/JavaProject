package oops_Concept;

public class Data_Encapsulation {
	private String subject;
	private int studentCount;
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

	public void displayMethod() {
		System.out.println("This ia a   "  +   subject + "Classroom of sudents   "   +studentCount);
	}
}
