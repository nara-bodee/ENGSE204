package lab2_2;
import java.util.Scanner;

class Student{
	private String studentID;
	private String name;
	
	public Student(String studentID,String name) {
		this.studentID = studentID;
		this.name = name;
	}
	public void displayInfo() {
        System.out.println("Student ID :"+studentID);
        System.out.println("Name :"+name);
    }
}	
public class lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Enter Student ID :");
		String studentID = input.nextLine();
		
		System.out.println("Enter Name :");
		String name = input.nextLine();
		
		input.close();
		
		Student std1 = new Student(studentID, name);
		
		std1.displayInfo();
		
	}

}
