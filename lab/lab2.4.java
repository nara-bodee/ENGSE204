package lab2_4;
import java.util.Scanner;

class Student{
	private String name;
	private int midtermScore;
	private int finalScore;
	
	public Student(String name,int midtermScore ,int finalScore) {
		this.name = name;
		this.midtermScore = midtermScore;
		this.finalScore = finalScore;
	}
	
	public double calculateAverage() {
		return (midtermScore + finalScore)/2;
	}
	
	public void displaySummary() {
		double avg = calculateAverage();
		String status;
		
		if(avg >= 50) {
			status = "Pass";
		} else {
			status = "Fall";
		}
		System.out.println("Name: "+name);
		System.out.println("Average Score: "+avg);
		System.out.println("Status"+ status);
	}
}


public class lab2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String inputName = input.nextLine();
		System.out.println("Enter Midterm Score: ");
		int inputMidterm = input.nextInt();
		System.out.println("Enter Final Score: ");
		int inputFinal = input.nextInt();
		
		Student student1 = new Student(inputName, inputMidterm, inputFinal);
		input.close();
		student1.displaySummary();
	}

}
