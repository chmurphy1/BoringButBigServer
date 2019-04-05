package com.christopherwmurphy.BoringButBigBackEnd.entities.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class WorkoutPk  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(name="workout_id")
    private Integer workoutId;
	
	@Column(name="language")
    private String language;
    
	public Integer getWorkoutId() {
		return workoutId;
	}
	public void setWorkoutId(Integer workoutId) {
		this.workoutId = workoutId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public WorkoutPk(Integer workoutId, String language) {
		super();
		this.workoutId = workoutId;
		this.language = language;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((workoutId == null) ? 0 : workoutId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WorkoutPk other = (WorkoutPk) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (workoutId == null) {
			if (other.workoutId != null)
				return false;
		} else if (!workoutId.equals(other.workoutId))
			return false;
		return true;
	}
}
