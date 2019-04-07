package com.christopherwmurphy.BoringButBigBackEnd.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christopherwmurphy.BoringButBigBackEnd.entities.Exercise;
import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseVideos;
import com.christopherwmurphy.BoringButBigBackEnd.repository.ExerciseVideosRepository;
import com.christopherwmurphy.BoringButBigBackEnd.utilities.Constants;

@Service
public class ExerciseVideosService {

	@Autowired
	ExerciseVideosRepository evRepo;
	
	public ExerciseVideos getVideoById(int id) {
		ExerciseVideos vid = null;
				
		if(id >= 0) {
			vid  = evRepo.findById(id);
		}
		
		return vid;
	}
	
	public List<ExerciseVideos> getAllExerciseVideos() {
		
		Iterable<ExerciseVideos> videos = evRepo.findAll();
		List<ExerciseVideos> vids = new ArrayList();
		
		for(ExerciseVideos s: videos) {
			vids.add(s);
		}
		return vids;
	}
	
	public List<ExerciseVideos> getExerciseVideosNotInId(Set<Integer> id){
		List<ExerciseVideos> ex = null;
		
		if((id != null) && (!id.isEmpty())) {
			ex = evRepo.findByIdNotIn(id);
		}
		return ex;
	}
}
