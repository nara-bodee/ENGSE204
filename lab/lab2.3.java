package lab2_3;
import java.util.Scanner;

class Student {

    private String studentId;
    private String name;

    public static int studentCount = 0; 

    public Student(String studentId, String name) {
    	
        this.studentId = studentId;
        this.name = name;

        Student.studentCount++; 
    }
}

public class lab2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter N");
        int N = input.nextInt(); 
        input.nextLine(); 

        for (int i = 0; i < N; i++) {
            
            System.out.println("Enter StudentID " + (i + 1) + ": ");
            String studentId = input.nextLine();
            System.out.println("Enter Name " + (i + 1) + ": ");
            String name = input.nextLine(); 
            Student newStudent = new Student(studentId, name);
                        
        }

        System.out.println("Student.studentCount : " + Student.studentCount);

        input.close();
    }
}
