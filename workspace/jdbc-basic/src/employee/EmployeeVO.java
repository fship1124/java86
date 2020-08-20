
/*
 * employees -> EmployeesVO
 * employee_id, last_name, salary, department_id, 
 */
package employee;

public class EmployeeVO {
	private int employeeId;
	private String lastName;
	private int salary;
	private int departmentId;
	private String email;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "EmployeeVO [employeeId=" + employeeId + ", lastName=" + lastName + ", salary=" + salary
				+ ", departmentId=" + departmentId + ", email=" + email + "]";
	}
	
	

}
