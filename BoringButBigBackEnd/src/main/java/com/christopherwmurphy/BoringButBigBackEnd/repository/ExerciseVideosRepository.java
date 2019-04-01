package com.christopherwmurphy.BoringButBigBackEnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseVideos;

@Repository
public interface ExerciseVideosRepository extends CrudRepository<ExerciseVideos, Integer>{
	public ExerciseVideos findById(int id);
}
