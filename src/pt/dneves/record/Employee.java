package pt.dneves.record;

import java.util.Objects;

public class Employee {

	private final int id;

	private final String firstName;
	private final String lastName;
	
	private final long salary;
	

	public Employee(int id, String firstName, String lastName, long salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public long getSalary() {
		return salary;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		
		Employee other = (Employee) obj;

		if (id != other.id) {
			return false;
		}
		
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}

		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		
		if (salary != other.salary) {
			return false;
		}
		
		
		return true;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}	

}
