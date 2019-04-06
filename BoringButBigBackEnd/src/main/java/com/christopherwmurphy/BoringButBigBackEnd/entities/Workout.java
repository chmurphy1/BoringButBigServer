package com.christopherwmurphy.BoringButBigBackEnd.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.christopherwmurphy.BoringButBigBackEnd.utilities.Constants;

@Entity
@Table(name = "workout")
public class Workout {
	
	@Id
	@Column(name="seq_num")
	private Integer seqNum;
	
	@Column(name = "workout_id")
	private Integer workoutId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "language")
	private String language;
	
	public Workout() {
		this.workoutId = 0;
		this.name = Constants.EMPTY;
		this.language = Constants.EMPTY;
		this.seqNum = 0;
	}
	
	public Integer getWorkoutId() {
		return workoutId;
	}
	public void setWorkoutId(Integer workoutId) {
		this.workoutId = workoutId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(Integer seqNum) {
		this.seqNum = seqNum;
	}
}
