package MatinClass;

public class Employee {
	
	
	public String name; 
	public String lastName;
	public double salary;
	

	
		
	
	public Employee(String name, String lastName, double salary) {
		
		this.name = name;
		this.lastName= lastName;
		this.salary = salary;
		
	}
	
	
	
	public double getsalary() {
		if (salary <3000.000) {
			System.out.println( " employee work in resturant");
		}else {
				System.out.println(" employee work in bank ");
			}
		return salary;
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Employee employee = new Employee("Ahmad", "Sidiqi", 3000.00);
	Employee employee2 = new Employee(" Mobasher", "shirzai", 2000.00);
		

	
	System.out.println(employee.lastName);
	System.out.println(employee.name);
	System.out.println(employee.getsalary());
	System.out.println(employee2.name);
	System.out.println(employee2.lastName);
	System.out.println(employee2.getsalary());
	
	
	}		
	
}
