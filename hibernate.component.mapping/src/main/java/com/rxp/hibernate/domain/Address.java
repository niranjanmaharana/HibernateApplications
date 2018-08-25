package com.rxp.hibernate.domain;

public class Address {
	private String houseNo;
	private String district;
	private String state;
	private int pinNo;
	
	public Address(String houseNo, String district, String state, int pinNo) {
		super();
		this.houseNo = houseNo;
		this.district = district;
		this.state = state;
		this.pinNo = pinNo;
	}

	public Address() {}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinNo() {
		return pinNo;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", district=" + district + ", state=" + state + ", pinNo=" + pinNo + "]";
	}
}