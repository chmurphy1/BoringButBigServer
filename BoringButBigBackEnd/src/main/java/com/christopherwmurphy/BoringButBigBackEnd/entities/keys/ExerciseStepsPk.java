package com.christopherwmurphy.BoringButBigBackEnd.entities.keys;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ExerciseStepsPk implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="exercise_id", insertable=false, updatable=false)
	private Integer exerciseId;

	@Column(name="step_seq")
	private Integer stepSeq;
	
	public Integer getExerciseId() {
		return exerciseId;
	}
	public void setExerciseId(Integer exerciseId) {
		this.exerciseId = exerciseId;
	}
	public Integer getStepSeq() {
		return stepSeq;
	}
	public void setStepSeq(Integer stepSeq) {
		this.stepSeq = stepSeq;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exerciseId == null) ? 0 : exerciseId.hashCode());
		result = prime * result + ((stepSeq == null) ? 0 : stepSeq.hashCode());
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
		ExerciseStepsPk other = (ExerciseStepsPk) obj;
		if (exerciseId == null) {
			if (other.exerciseId != null)
				return false;
		} else if (!exerciseId.equals(other.exerciseId))
			return false;
		if (stepSeq == null) {
			if (other.stepSeq != null)
				return false;
		} else if (!stepSeq.equals(other.stepSeq))
			return false;
		return true;
	}
}