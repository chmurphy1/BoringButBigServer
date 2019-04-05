package com.christopherwmurphy.BoringButBigBackEnd.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.christopherwmurphy.BoringButBigBackEnd.entities.keys.WorkoutPk;
import com.christopherwmurphy.BoringButBigBackEnd.utilities.Constants;

@Entity
@Table(name = "workout")
public class Workout {
	
	@EmbeddedId
	WorkoutPk id;

	@Column(name = "name")
	private String name;
	
	public Workout() {
		this.name = Constants.EMPTY;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
