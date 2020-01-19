package in.aboutaakash.DemoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;


//@Entity(name="employee_table")
//We can use hard-coded table name as well.
@Entity
public class Employee {

	@Id
	private int empId;
	private EmployeeName empName;
	private int empSalary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public EmployeeName getEmpName() {
		return empName;
	}
	public void setEmpName(EmployeeName empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
}
