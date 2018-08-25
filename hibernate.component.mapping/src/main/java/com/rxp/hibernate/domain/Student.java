package com.rxp.hibernate.domain;

public class Student {
	private int rollNo;
	private String studentName;
	private String course;
	private Address address;
	
	public Student() {}

	public Student(int rollNo, String studentName, String course, Address address) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.course = course;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", course=" + course + ", address="
				+ address + "]";
	}
}