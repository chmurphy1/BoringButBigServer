package com.christopherwmurphy.BoringButBigBackEnd.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.christopherwmurphy.BoringButBigBackEnd.entities.keys.WorkoutPlanPk;

@Entity
@Table(name = "workout_plan")
public class WorkoutPlan {

	@EmbeddedId
	private WorkoutPlanPk id;

	@ManyToOne
	private Exercise exercise;
	
	@ManyToOne
	@JoinColumn(name="set_id")
	private SetScheme setScheme;
	
	@ManyToOne
	@JoinColumn(name="workout_id", insertable=false, updatable=false)
	private Workout workout;
	
	@Column(name = "optional")
	private Boolean optional;
	
	public WorkoutPlan(){
		this.exercise = null;
		this.setScheme = null;
		this.workout = null;
		this.optional = false;
	}

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}

	public SetScheme getSetScheme() {
		return setScheme;
	}

	public void setSetScheme(SetScheme setScheme) {
		this.setScheme = setScheme;
	}

	public Workout getWorkout() {
		return workout;
	}

	public void setWorkout(Workout workout) {
		this.workout = workout;
	}
	
	public Boolean getOptional() {
		return optional;
	}

	public void setOptional(Boolean optional) {
		this.optional = optional;
	}
	
	public WorkoutPlanPk getId() {
		return id;
	}

	public void setId(WorkoutPlanPk id) {
		this.id = id;
	}
}
