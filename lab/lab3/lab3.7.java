package lab3_7;
import java.util.Scanner;

class Employee {
    private String employeeId;  
    private String department; 

    public Employee(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
}
public class lab3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Employee Id:");
		String empId = input.nextLine();
		System.out.println("Enter Department:");
        String initialDept = input.nextLine();
        System.out.println("Enter New Department:");
        String newDept = input.nextLine();

        Employee emp = new Employee(empId, initialDept);

        emp.setDepartment(newDept);

        System.out.println("Employee Id:"+emp.getEmployeeId());
        System.out.println("Department:"+emp.getDepartment());
    }
}


