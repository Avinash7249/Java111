package Question4;

public class Student {
	private int rollNumber;
	private String studentName;
	private int marks;
	
	Student(){};
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
	
	public void Student(int rollNumber,String studentName,int marks) {
		this.rollNumber=rollNumber;
		this.studentName=studentName;
		this.marks=marks;
	}
}
