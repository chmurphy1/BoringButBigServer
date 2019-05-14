package com.christopherwmurphy.BoringButBigBackEnd.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christopherwmurphy.BoringButBigBackEnd.entities.Exercise;
import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseVideos;
import com.christopherwmurphy.BoringButBigBackEnd.repository.ExerciseRepository;
import com.christopherwmurphy.BoringButBigBackEnd.utilities.Constants;

@Service
public class ExerciseService {
	
	@Autowired
	ExerciseRepository exRepo;
	
	public Exercise getExerciseById(int id) {
		
		Exercise ex = null;
		
		if(id >= 0) {
			ex = exRepo.findById(id);
		}
		return ex;
	}
	
	public List<Exercise> getAllExercises() {
		List<Exercise> exs = exRepo.findAllByOrderById();
		
		return exs;
	}
	
	public List<Exercise> getExersizeByLang(String lang) {
		return exRepo.findByLanguage(lang);
	}
	
	public List<Exercise> getExerciseNotInId(Set<Integer> id){
		List<Exercise> ex = null;
		
		if((id != null) && (!id.isEmpty())) {
			ex = exRepo.findByIdNotIn(id);
		}
		return ex;
	}
	
}
