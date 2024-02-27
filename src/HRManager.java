class Employee{
	void work() {
		System.out.println("Employee is working");
	}
	
	void getSalary() {
		System.out.println("Salary of the employee is Rs. 550000");
	}
}
public class HRManager extends Employee {

	void work() {
		System.out.println("HRManager is working");
	}
	
	void addEmployee() {
		System.out.println("New Employee is added");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRManager emp=new HRManager();
		
		emp.work();
		emp.addEmployee();
	}

}
