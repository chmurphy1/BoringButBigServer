package com.christopherwmurphy.BoringButBigBackEnd.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseSteps;
import com.christopherwmurphy.BoringButBigBackEnd.entities.keys.ExerciseStepsPk;

public interface ExerciseStepsRepository extends CrudRepository<ExerciseSteps, ExerciseStepsPk>{
	public List<ExerciseSteps> findByIdExerciseId(int exerciseId);
}
