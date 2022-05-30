package Question4;

public class Student extends Person{

	int studentId ;
    String courseEnrolled ;
	int courseFee ;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ "]";
	}
	public Student(String name, String gender, Address address, int studentId, String courseEnrolled, int courseFee) {
		super(name, gender, address);
		this.studentId = studentId;
		this.courseEnrolled = courseEnrolled;
		this.courseFee = courseFee;
	}
	
}
