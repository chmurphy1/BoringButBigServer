package com.christopherwmurphy.BoringButBigBackEnd.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christopherwmurphy.BoringButBigBackEnd.entities.Exercise;
import com.christopherwmurphy.BoringButBigBackEnd.entities.Workout;
import com.christopherwmurphy.BoringButBigBackEnd.repository.WorkoutRepository;
import com.christopherwmurphy.BoringButBigBackEnd.utilities.Constants;

@Service
public class WorkoutService {

	@Autowired
	WorkoutRepository wRepo;
	
	public List<Workout> getWorkoutByLanguage(String lang){
		return wRepo.findByLanguage(lang);
	}
	
	public List<Workout> getAllWorkouts() {
		List<Workout> wList = wRepo.findAllByOrderBySeqNum();
		
		return wList;
	}

	public List<Workout> getExerciseNotInId(Set<Integer> id){
		List<Workout> ex = null;
		
		if((id != null) && (!id.isEmpty())) {
			ex = wRepo.findByWorkoutIdNotIn(id);
		}
		return ex;
	}
}
