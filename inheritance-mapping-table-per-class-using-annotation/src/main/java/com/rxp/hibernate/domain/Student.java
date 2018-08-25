package com.rxp.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@DiscriminatorValue(value = "student")
public class Student extends Person{
	@Column
	private String course;
	@Column
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
	@Override
	public String toString() {
		return "Student [course=" + course + ", courseFees=" + courseFees + "]";
	}
}