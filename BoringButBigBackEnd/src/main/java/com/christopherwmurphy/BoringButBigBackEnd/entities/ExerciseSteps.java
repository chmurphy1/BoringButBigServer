package com.christopherwmurphy.BoringButBigBackEnd.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.christopherwmurphy.BoringButBigBackEnd.entities.keys.ExerciseStepsPk;


/**
 * The persistent class for the exercise_steps database table.
 * 
 */
@Entity
@Table(name="exercise_steps")
public class ExerciseSteps implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ExerciseStepsPk id;

	@Column(name="step_text")
	private String stepText;

	@Column(name="language")
	private String language;
	
	public ExerciseSteps() {
	}

	public ExerciseStepsPk getId() {
		return this.id;
	}

	public void setId(ExerciseStepsPk id) {
		this.id = id;
	}

	public String getStepText() {
		return this.stepText;
	}

	public void setStepText(String stepText) {
		this.stepText = stepText;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}