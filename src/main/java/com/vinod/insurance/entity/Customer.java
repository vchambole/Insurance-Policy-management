package com.vinod.insurance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;

	@Column(name = "first_name")
	protected String firstName;

	@Column(name = "last_name")
	protected String lastName;
	
	@Column(name = "email")
	protected String email;
	
	@Column(name = "address")
	protected String address;
	
	@Column(name = "city")
	protected String city;
	
	@Column(name = "state")
	protected String state;
	
	@Column(name = "pincode")
	protected String pincode;
	
	@Column(name = "role")
	protected String role;

	public Customer(String firstName, String lastName, String email, String address, String city, String state,
			String pincode, String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.role = role;
	}

	public Customer() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
