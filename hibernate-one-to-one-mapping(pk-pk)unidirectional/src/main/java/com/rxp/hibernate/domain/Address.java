package com.rxp.hibernate.domain;

public class Address {
	private int personId;
	private String houseNo, state, country;
	private Person person;
	public Address() {}
	public Address(String houseNo, String state, String country, Person person) {
		super();
		this.houseNo = houseNo;
		this.state = state;
		this.country = country;
		this.person = person;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Address [personId=" + personId + ", houseNo=" + houseNo + ", state=" + state + ", country=" + country
				+ ", person=" + person + "]";
	}
}