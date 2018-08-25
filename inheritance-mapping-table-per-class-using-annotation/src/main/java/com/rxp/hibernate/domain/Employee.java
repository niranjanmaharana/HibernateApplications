package com.rxp.hibernate.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@DiscriminatorValue("emp")
public class Employee extends Person{
	@Column
	private double salary;
	@Column
	private Date joiningDate;
	@Column
	private int deptNo;
	@Column
	private String deptName;
	
	public Employee() {}
	
	public Employee(String firstName, String lastName, double salary, Date joiningDate, int deptNo, String deptName) {
		super(firstName, lastName);
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.deptNo = deptNo;
		this.deptName = deptName;
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
		return "Employee [salary=" + salary + ", joiningDate=" + joiningDate + ", deptNo=" + deptNo + ", deptName="
				+ deptName + "]";
	}
}