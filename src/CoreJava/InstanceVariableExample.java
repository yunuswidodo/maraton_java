package CoreJava;

public class InstanceVariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee  = new Employee();
		
		employee.id = 1;
		employee.empName = "yunus";
		employee.age = 20;
		
		
		System.out.println(employee.id);
		System.out.println(employee.empName);
		System.out.println(employee.age);
		
	}

}

class Employee {
	
	// instance
	public int id;
	public String empName;
	public int age;
	
	
}
