package com.rxp.hibernate.domain;

public class Student extends Person{
	private int rollNo;
	private String course;
	private double courseFees;
	
	public Student() {}
	public Student(String firstName, String lastName, String course, double courseFees) {
		super(firstName, lastName);
		this.course = course;
		this.courseFees = courseFees;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", course=" + course + ", courseFees=" + courseFees + "]";
	}
}