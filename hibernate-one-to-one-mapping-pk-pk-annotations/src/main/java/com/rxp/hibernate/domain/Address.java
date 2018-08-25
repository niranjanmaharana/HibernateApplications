package com.rxp.hibernate.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GenericGenerator(name = "myGenerator", 
		strategy = "foreign", 
		parameters = @Parameter(name = "property", value = "person")
		)
	@GeneratedValue(generator = "myGenerator")
	@Column
	private int personId;
	@Column
	private String houseNo;
	@Column
	private String state;
	@Column
	private String country;
	@OneToOne(/*mappedBy = "address", */cascade = CascadeType.ALL)
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