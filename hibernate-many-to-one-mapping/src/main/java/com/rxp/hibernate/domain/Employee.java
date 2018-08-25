package com.rxp.hibernate.domain;

public class Employee {
	private int empNo;
	private String empName;
	private double salary;
	private Department department;
	public Employee() {}
	public Employee(String empName, double salary, Department department) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.department = department;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + ", department=" + department
				+ "]";
	}
}