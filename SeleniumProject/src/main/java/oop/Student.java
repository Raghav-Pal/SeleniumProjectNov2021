package oop;

public class Student {
	
	String studentName;
	int sub1Marks;
	int sub2Marks;
	
	public void printTotal() {
		System.out.println(studentName+ " got toal marks "+(sub1Marks+sub2Marks));
	}

	public static void main(String[] args) {
		
		Student john = new Student();
		john.studentName = "John";
		john.sub1Marks = 75;
		john.sub2Marks = 85;
		john.printTotal();
	}
}
