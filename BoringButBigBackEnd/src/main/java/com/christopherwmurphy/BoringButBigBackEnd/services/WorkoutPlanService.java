package com.christopherwmurphy.BoringButBigBackEnd.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.christopherwmurphy.BoringButBigBackEnd.entities.WorkoutPlan;
import com.christopherwmurphy.BoringButBigBackEnd.entities.keys.WorkoutPlanPk;
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
		List<WorkoutPlan> wp = wpRepo.findAll();

		return wp;
	}
	
	public List<WorkoutPlan> getWorkoutPlansNotInList(Set<WorkoutPlanPk> id){
		List<WorkoutPlan> list = null;
		
		if(id != null && !id.isEmpty()) {
			list = wpRepo.findByIdNotIn(id);
		}
		
		return list;
	}
}
