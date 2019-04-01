package com.christopherwmurphy.BoringButBigBackEnd.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseVideos;
import com.christopherwmurphy.BoringButBigBackEnd.entities.WorkoutPlan;
import com.christopherwmurphy.BoringButBigBackEnd.repository.WorkoutPlanRepository;

@Service
public class WorkoutPlanService {

	@Autowired
	WorkoutPlanRepository wpRepo;
	
	public List<WorkoutPlan> getWorkoutPlanById(int workoutId){
		
		List<WorkoutPlan> wp = null;
		
		if(workoutId >= 0) {
			wp = wpRepo.findByIdWorkoutId(workoutId);
		}
		
		return wp;
	}
	
	public List<WorkoutPlan> getAllWorkoutPlans() {
		
		Iterable<WorkoutPlan> plans = wpRepo.findAll();
		List<WorkoutPlan> wp = new ArrayList();
		
		for(WorkoutPlan s: plans) {
			wp.add(s);
		}
		return wp;
	}
}
