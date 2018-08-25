package com.rxp.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "circle")
public class Circle extends Shape{
	@Column
	private int radius;

	public Circle() {}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public Circle(String shapeName, int radius) {
		super(shapeName);
		this.radius = radius;
	} 
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}