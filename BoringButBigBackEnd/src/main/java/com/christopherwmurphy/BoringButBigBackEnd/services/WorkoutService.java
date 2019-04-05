package com.christopherwmurphy.BoringButBigBackEnd.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christopherwmurphy.BoringButBigBackEnd.entities.Workout;
import com.christopherwmurphy.BoringButBigBackEnd.repository.WorkoutRepository;

@Service
public class WorkoutService {

	@Autowired
	WorkoutRepository wRepo;
	
	public List<Workout> getWorkoutByLanguage(String lang){
		return wRepo.findByIdLanguage(lang);
	}
	
	public List<Workout> getAllWorkouts() {
		
		Iterable<Workout> workouts = wRepo.findAll();
		List<Workout> wList = new ArrayList();
		
		for(Workout s: workouts) {
			wList.add(s);
		}
		return wList;
	}
}
