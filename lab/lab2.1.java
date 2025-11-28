package lab2_1;
import java.util.Scanner;

class Student {
	String studentId;
	String name;

	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	public Student() {
	}
}

public class lab2_1 {
	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
     
		System.out.println("Enter Student ID:");
		String StudentId = input.nextLine();
     
		System.out.println("Enter Name:");
		String inputName = input.nextLine();
     
		Student studentObject = new Student();
     
		studentObject.studentId = StudentId;
		studentObject.name = inputName;
		
		System.out.println("ID: "+studentObject.studentId);
		System.out.println("Name: "+studentObject.name);
     
		input.close();
	}
}
