package com.rxp.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column
	private String state;
	@Column
	private String district;
	public Address() {}
	public Address(String state, String district) {
		super();
		this.state = state;
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", district=" + district + "]";
	}
}