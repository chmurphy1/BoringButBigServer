package com.christopherwmurphy.BoringButBigBackEnd.repository;

import java.util.List;
import java.util.Set;

import javax.persistence.OrderBy;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseSteps;
import com.christopherwmurphy.BoringButBigBackEnd.entities.keys.ExerciseStepsPk;

public interface ExerciseStepsRepository extends CrudRepository<ExerciseSteps, ExerciseStepsPk>{
	public List<ExerciseSteps> findByIdExerciseId(int exerciseId);
	public List<ExerciseSteps> findByIdNotIn(List<ExerciseStepsPk> id);
	
	@Query(value = "Select * From exercise_steps order by exercise_id, step_seq", 
		   nativeQuery = true)
	public List<ExerciseSteps> findAll();
}
