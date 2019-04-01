package com.christopherwmurphy.BoringButBigBackEnd.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseSteps;
import com.christopherwmurphy.BoringButBigBackEnd.entities.WorkoutPlan;
import com.christopherwmurphy.BoringButBigBackEnd.repository.ExerciseStepsRepository;

@Service
public class ExerciseStepsService {
	
	@Autowired
	ExerciseStepsRepository exsRepo;
	
	public List<ExerciseSteps> getExerciseStepsByStepId(int exerciseId){
		List<ExerciseSteps> steps = null;
		
		if(exerciseId >= 0) {
			steps = exsRepo.findByIdExerciseId(exerciseId);
		}
		return steps;
	}

	public List<ExerciseSteps> getAllExerciseSteps() {
		
		Iterable<ExerciseSteps> steps = exsRepo.findAll();
		List<ExerciseSteps> st = new ArrayList();
		
		for(ExerciseSteps s: steps) {
			st.add(s);
		}
		return st;
	}
}
