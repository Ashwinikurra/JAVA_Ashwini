package com.Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	private String employeeName;
	private int employeeId;
	private double employeeSalary;
	
	public Employee(String employeeName, int employeeId, double employeeSalary, String employeeJobRole) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
		this.employeeJobRole = employeeJobRole;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeJobRole() {
		return employeeJobRole;
	}
	public void setEmployeeJobRole(String employeeJobRole) {
		this.employeeJobRole = employeeJobRole;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeSalary="
				+ employeeSalary + ", employeeJobRole=" + employeeJobRole + "]";
	}
	private String employeeJobRole;
	
}
public class EmployeeMain {
 public static void main(String[] args)
 {
	List<Employee> employee= Arrays.asList(new Employee("srivani", 101, 20000, "application Developer"),
			new Employee("srividhya", 102, 32000, "web Developer"),
			new Employee("Gowthami", 103, 19500, "google mapping"),
			new Employee("madhuri", 104, 41000, "testing Engineer"),
			new Employee("srivani", 105, 20000, "Data Analytic"));
	employee.stream().filter(e->e.getEmployeeSalary()>23000)
	                 .map(e->e.getEmployeeSalary())
	                 .forEach(e->System.out.println(e));
 }
}
