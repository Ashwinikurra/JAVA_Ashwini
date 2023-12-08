package com.corejava.Collections;

import java.util.ArrayList;

public class Employee 
{
	private String employeeName;
	private int employeeId;
	private double employeeSalary;
	private long employeeMobileNumber;
	private String employeeJobRole;
	private String employeeJobLocation;
	private int employeeAge;
	private String employeeMailId;
	private String empolyeeCompanyName;

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

	public long getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}

	public void setEmployeeMobileNumber(long employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}

	public String getEmployeeJobRole() {
		return employeeJobRole;
	}

	public void setEmployeeJobRole(String employeeJobRole) {
		this.employeeJobRole = employeeJobRole;
	}

	public String getEmployeeJobLocation() {
		return employeeJobLocation;
	}

	public void setEmployeeJobLocation(String employeeJobLocation) {
		this.employeeJobLocation = employeeJobLocation;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getEmployeeMailId() {
		return employeeMailId;
	}

	public void setEmployeeMailId(String employeeMailId) {
		this.employeeMailId = employeeMailId;
	}

	public String getEmpolyeeCompanyName() {
		return empolyeeCompanyName;
	}

	public void setEmpolyeeCompanyName(String empolyeeCompanyName) {
		this.empolyeeCompanyName = empolyeeCompanyName;
	}

public Employee(String employeeName, int employeeId, double employeeSalary, long employeeMobileNumber,
			String employeeJobRole, String employeeJobLocation, int employeeAge, String employeeMailId,
			String empolyeeCompanyName) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
		this.employeeMobileNumber = employeeMobileNumber;
		this.employeeJobRole = employeeJobRole;
		this.employeeJobLocation = employeeJobLocation;
		this.employeeAge = employeeAge;
		this.employeeMailId = employeeMailId;
		this.empolyeeCompanyName = empolyeeCompanyName;
	}

@Override
public String toString() 
	{
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeSalary="
				+ employeeSalary + ", employeeMobileNumber=" + employeeMobileNumber + ", employeeJobRole=" + employeeJobRole
				+ ", employeeJobLocation=" + employeeJobLocation + ", employeeAge=" + employeeAge + ", employeeMailId="
				+ employeeMailId + ", empolyeeCompanyName=" + empolyeeCompanyName + "]";
	}
public void display() 
	{
		System.out.println("employeeName=" + employeeName);
		System.out.println("employeeId=" + employeeId);
		System.out.println(" employeeSalary="	+ employeeSalary);
		System.out.println(" employeeMobileNumber=" + employeeMobileNumber);
		System.out.println("employeeJobRole=" + employeeJobRole);
		System.out.println("employeeJobLocation=" + employeeJobLocation);
		System.out.println("employeeAge=" + employeeAge);
		System.out.println("employeeMailId="+employeeMailId);
		System.out.println("empolyeeCompanyName=" + empolyeeCompanyName);
	}

	public static void main(String[] args)
	{
		Employee e1 =new Employee("yaseen",127456, 28000.25, 9517533695l, "software developer", "chennai", 22, "yaseen1432@gmail.com", "cognizant");
        Employee e2= new Employee("ganesh", 159753, 30000.50, 9517538520l, "frontened developer", "mumbai", 23, "ganesh159@gmail.com", "wipro");
        Employee e3 =new Employee("vamshi",456852, 48000.49, 8184901084l, "Application developer", "bengaluru", 22, "vamshi624@gmail.com", "infosys");
        e1.display();
        System.out.println("___________________________________");
        System.out.println("___________________________________");
        e2.display();
        System.out.println("___________________________________");
        System.out.println("___________________________________");
        e3.display();
        ArrayList<Employee> emp= new ArrayList<>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        System.out.println("___________________________________");
        System.out.println("___________________________________");
        System.out.println(emp.get(0));
        System.out.println(emp.get(1));
        System.out.println(emp.get(2));
        
	}
}
