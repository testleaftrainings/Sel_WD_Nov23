package week2.day2;

public class Student {
	int rollNum;
	String studentName;
	int rollNo;
	String collegeName;
	float markScored;
	float cgpa;
	public void studentDetails() {
		
		String studentName;
		int rollNo;
		String collegeName;
		float markScored;
		float cgpa;
		int rollNum = 1123;
		String name="Princila";
		System.out.println("Student num"+rollNum);
		System.out.println(name);
	}
public static void main(String[] args) {
	Student stu =new Student();
	stu.studentDetails();
	System.out.println(stu.rollNum);
	
}
}
