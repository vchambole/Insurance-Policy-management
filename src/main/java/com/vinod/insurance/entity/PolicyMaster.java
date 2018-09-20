package com.vinod.insurance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policy_master")
public class PolicyMaster {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "policy_name")
	private String policyName;
	
	@Column(name = "min_duration")
	private int minDuration;
	
	@Column(name = "premium_percent")
	private double premiumPercent;
	
	@Column(name = "applicable_age")
	private int applicableAge;

	public PolicyMaster(String policyName, int minDuration, double premiumPercent, int applicableAge) {
		super();
		this.policyName = policyName;
		this.minDuration = minDuration;
		this.premiumPercent = premiumPercent;
		this.applicableAge = applicableAge;
	}

	public PolicyMaster() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public int getMinDuration() {
		return minDuration;
	}

	public void setMinDuration(int minDuration) {
		this.minDuration = minDuration;
	}

	public double getPremiumPercent() {
		return premiumPercent;
	}

	public void setPremiumPercent(double premiumPercent) {
		this.premiumPercent = premiumPercent;
	}

	public int getApplicableAge() {
		return applicableAge;
	}

	public void setApplicableAge(int applicableAge) {
		this.applicableAge = applicableAge;
	}

}
