package pt.dneves.record;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		// Class
		
		Employee employee1 = new Employee(1, "Pablo", "Escobar", 4000);

		System.out.println(employee1.toString());

		System.out.println(employee1.getId());

		
		// Record
		
		EmployeeRecord employeeRecord1 = new EmployeeRecord(1, "Pablo", "Escobar", 4000);
		
		System.out.println(employeeRecord1.toString());
		
		System.out.println(employeeRecord1.id());
		
		
		// Class equals
		
		Employee employee2 = new Employee(1, "Pablo", "Escobar", 4000);
		
		System.out.println(employee1.equals(employee2));

		
		// Record equals
		
		EmployeeRecord employeeRecord2 = new EmployeeRecord(1, "Pablo", "Escobar", 4000);
		
		System.out.println(employeeRecord1.equals(employeeRecord2));
		
		
	}
	
}
