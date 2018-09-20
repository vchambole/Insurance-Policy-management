package com.vinod.insurance.entity;

public class Customer {
	protected int id;
	protected String firstName;
	protected String lastName;
	protected String email;
	protected String address;
	protected String city;
	protected String state;
	protected String pincode;
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
