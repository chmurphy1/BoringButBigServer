package com.christopherwmurphy.BoringButBigBackEnd.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "set_scheme")
public class SetScheme {
	
	@Id
	@Column(name = "set_id")
	private Integer setId;
	
	@Column(name = "set")
	private Integer set;
	
	@Column(name = "reps")
	private Integer reps;
	
	@Column(name = "percentage")
	private Double percentage;
	
	public SetScheme() {
		this.setId = 0;
		this.set = 0;
		this.reps = 0;
		this.percentage = 0.0;
	}
	
	public Integer getSetId() {
		return setId;
	}

	public void setSetId(Integer setId) {
		this.setId = setId;
	}

	public Integer getSet() {
		return set;
	}

	public void setSet(Integer set) {
		this.set = set;
	}

	public Integer getReps() {
		return reps;
	}

	public void setReps(Integer reps) {
		this.reps = reps;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

}
