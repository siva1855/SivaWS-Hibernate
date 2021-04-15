package siva.hb.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("employee")
public class Employee extends Person {

	@Column(name = "employee_sal")
	private Double employeeSalary;
	
	@Column(name = "employee_department")
	private String employeeDepartment;

	public Employee() {
		super();
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	@Override
	public String toString() {
		return "Employee [employeeSalary=" + employeeSalary + ", employeeDepartment=" + employeeDepartment + "]";
	}

}
