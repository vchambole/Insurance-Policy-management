package com.vinod.insurance.entity;

public class Policy {
	
	private int id;
	private String name;
	private int duration;
	private double sunAssured;
	private double premium;
	
	
	public Policy(String name, int duration, double sunAssured, double premium) {
		super();
		this.name = name;
		this.duration = duration;
		this.sunAssured = sunAssured;
		this.premium = premium;
	}
	
	
	
	public Policy() {
		super();
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getSunAssured() {
		return sunAssured;
	}
	public void setSunAssured(double sunAssured) {
		this.sunAssured = sunAssured;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	
	
}
