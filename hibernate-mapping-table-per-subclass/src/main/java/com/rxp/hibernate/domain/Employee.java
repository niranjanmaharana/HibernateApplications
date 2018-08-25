package com.rxp.hibernate.domain;

import java.util.Date;

public class Employee extends Person{
	private int empNo;
	private double salary;
	private Date joiningDate;
	private int deptNo;
	private String deptName;
	
	public Employee() {}
	
	public Employee(String firstName, String lastName, double salary, Date joiningDate, int deptNo, String deptName) {
		super(firstName, lastName);
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", salary=" + salary + ", joiningDate=" + joiningDate + ", deptNo=" + deptNo
				+ ", deptName=" + deptName + "]";
	}
}