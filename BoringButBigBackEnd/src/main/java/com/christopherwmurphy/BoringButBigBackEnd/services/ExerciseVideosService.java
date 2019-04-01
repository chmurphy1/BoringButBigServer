package com.christopherwmurphy.BoringButBigBackEnd.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseVideos;
import com.christopherwmurphy.BoringButBigBackEnd.repository.ExerciseVideosRepository;

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
}
