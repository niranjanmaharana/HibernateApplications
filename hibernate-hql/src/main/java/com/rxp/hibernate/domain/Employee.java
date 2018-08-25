package com.rxp.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@NamedQueries({@NamedQuery(name = "findEmployeeByDeptNo", query = "from Employee e where e.deptNo = :deptNo")})
@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GenericGenerator(name = "empNoGenerator", strategy = "increment")
	@GeneratedValue(generator = "empNoGenerator")
	private int empNo;
	@Column
	private String empName;
	@Column
	private double salary;
	@Column
	private int deptNo;
	public Employee() {}
	public Employee(String empName, double salary) {
		super();
		this.empName = empName;
		this.salary = salary;
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
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + "]";
	}
}