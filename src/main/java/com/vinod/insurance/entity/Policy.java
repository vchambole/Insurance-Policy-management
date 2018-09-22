package com.vinod.insurance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "duration")
	private int duration;

	@Column(name = "sum_assured")
	private double sunAssured;

	@Column(name = "premium")
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
