package com.christopherwmurphy.BoringButBigBackEnd.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseVideos;
import com.christopherwmurphy.BoringButBigBackEnd.entities.SetScheme;
import com.christopherwmurphy.BoringButBigBackEnd.repository.SetSchemeRepository;

@Service
public class SetSchemeService {

	@Autowired
	SetSchemeRepository ssRepo;
	
	public SetScheme getSetSchemeById(int id) {
		
		SetScheme scheme = null;
		
		if(id >= 0) {
			scheme = ssRepo.findById(id);
		}
		
		return scheme;
	}
	
	public List<SetScheme> getAllSetSchemes() {
		
		Iterable<SetScheme> setSchemes = ssRepo.findAll();
		List<SetScheme> schemeList = new ArrayList();
		
		for(SetScheme s: setSchemes) {
			schemeList.add(s);
		}
		return schemeList;
	}
	
	public List<SetScheme> getExerciseNotInId(List<Integer> id){
		List<SetScheme> ex = null;
		
		if((id != null) && (!id.isEmpty())) {
			ex = ssRepo.findBySetIdNotIn(id);
		}
		return ex;
	}
}
